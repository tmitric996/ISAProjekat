package com.ISA2020.back.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.ISA2020.back.dto.JwtAuthenticationRequest;
import com.ISA2020.back.dto.UserRequest;
import com.ISA2020.back.dto.UserTokenState;
import com.ISA2020.back.exception.ResourceConflictException;
import com.ISA2020.back.model.Pacijent;
import com.ISA2020.back.model.User;
import com.ISA2020.back.security.TokenUtils;
import com.ISA2020.back.service.PacijentServiceImpl;
import com.ISA2020.back.service.UserCustomDetailServiceImpl;
import com.ISA2020.back.service.UserServiceImpl;

@RestController
@EnableAutoConfiguration
@RequestMapping("/auth")
public class AuthController {
	@Autowired
	UserServiceImpl userService;
	@Autowired
	PacijentServiceImpl pacService;
	@Autowired
	private TokenUtils tokenUtils;
	@Autowired
	UserCustomDetailServiceImpl userDetailsService;

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@PostMapping("/login")
	public ResponseEntity<UserTokenState> createAuthenticationToken(@RequestBody JwtAuthenticationRequest authenticationRequest,
			HttpServletResponse response) {

		// 
		System.out.println("usao u zahtev");
		Authentication authentication = (Authentication) authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getEmail(),
						authenticationRequest.getPassword()));
		System.out.println("odradio authentifikaciju");
		// Ubaci korisnika u trenutni security kontekst
		SecurityContextHolder.getContext().setAuthentication((org.springframework.security.core.Authentication) authentication);

		// Kreiraj token za tog korisnika
		User user = (User) ((org.springframework.security.core.Authentication) authentication).getPrincipal();
		String jwt = tokenUtils.generateToken(user.getUsername());
		int expiresIn = tokenUtils.getExpiredIn();

		// Vrati token kao odgovor na uspesnu autentifikaciju
		return ResponseEntity.ok(new UserTokenState(jwt, expiresIn));
	}
	
	// Endpoint za registraciju novog korisnika
	@PostMapping("/register") // registracija bi trebalo da prolazi,samo lepo dasenasteluju polja sva da se upisuju
	public ResponseEntity<User> addUser(@RequestBody UserRequest userRequest, UriComponentsBuilder ucBuilder) {
		System.out.println("usao u registraciju");
		System.out.println(userRequest.toString());
		User existUser = this.userService.findByemail(userRequest.getEmail());
		if (existUser != null) {
			throw new ResourceConflictException(userRequest.getId(), "Email already exists");
		}
		System.out.println("prosaoproveru dali postoji usersatimemailom");
		Pacijent p = this.pacService.save(userRequest);
		System.out.println("prosao cuvanje pacijenta");
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/pacijenti/{id}").buildAndExpand(p.getId()).toUri());
		System.out.println("prosao uri  buider");
		return new ResponseEntity<>(p, HttpStatus.CREATED);
	}
	
	// U slucaju isteka vazenja JWT tokena, endpoint koji se poziva da se token osvezi
		@PostMapping(value = "/refresh")
		public ResponseEntity<UserTokenState> refreshAuthenticationToken(HttpServletRequest request) {

			String token = tokenUtils.getToken(request);
			String username = this.tokenUtils.getUsernameFromToken(token);
			User user = (User) this.userDetailsService.loadUserByUsername(username);

			if (this.tokenUtils.canTokenBeRefreshed(token, user.getLastPasswordResetDate())) {
				String refreshedToken = tokenUtils.refreshToken(token);
				int expiresIn = tokenUtils.getExpiredIn();

				return ResponseEntity.ok(new UserTokenState(refreshedToken, expiresIn));
			} else {
				UserTokenState userTokenState = new UserTokenState();
				return ResponseEntity.badRequest().body(userTokenState);
			}
		}

}
