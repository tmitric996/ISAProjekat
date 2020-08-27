package com.ISA2020.back.controller;

import java.util.List;

import com.ISA2020.back.request.GodisnjiOdmorRequest;
import com.ISA2020.back.response.GodisnjiOdmorResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ISA2020.back.model.GodisnjiOdmor;
import com.ISA2020.back.service.GodisnjiOdmorServiceImpl;

import javax.validation.Valid;

import static com.ISA2020.back.converter.GodisnjiOdmorConverter.toResponses;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/gododmor")
public class GodisnjiOdmorController {

	@Autowired
	GodisnjiOdmorServiceImpl godOdmorService;
	
	@PostMapping
	public GodisnjiOdmor save(@RequestBody GodisnjiOdmor go) {
		return godOdmorService.save(go);
	}
	@GetMapping
	public List<GodisnjiOdmor> findall(){
		return godOdmorService.findAll();
	}
	
	@GetMapping("/{idradnika}")
	public List<GodisnjiOdmor>  findZaRadnika(@RequestBody int id){
		return godOdmorService.findZaRadnika(id);
	}



	@GetMapping("/svi")
	public List<GodisnjiOdmorResponse> vratiSveGodisnjeOdmore(){
		return toResponses(godOdmorService.getAll());
	}

	@PostMapping("/dodaj")
	//ovde ce to biti
	public void posaljiZahtev(@Valid @RequestBody GodisnjiOdmorRequest godisnjiOdmorRequest, @AuthenticationPrincipal Long id){
		//preauthorize, hasrole, hasauthority razlike
		//preauthorize prvo proveri izraz pa udje u metodu
		//hasrole dodeljuje rolu
		//hasauthority dodeljuje autoritet nekoj roli
		//hasrole admin je slicnosto i hasauthority role admin
		godOdmorService.dodaj(godisnjiOdmorRequest, id);
	}

}
