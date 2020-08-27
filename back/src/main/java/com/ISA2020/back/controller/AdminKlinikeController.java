package com.ISA2020.back.controller;

import java.util.List;

import com.ISA2020.back.request.AdminKlinikeRequest;
import com.ISA2020.back.response.AdminKlinikeResponse;
import com.ISA2020.back.service.AdminKlinikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.ISA2020.back.model.AdminKlinike;
import com.ISA2020.back.service.AdminKlinikeServiceImpl;

import javax.validation.Valid;

import static com.ISA2020.back.converter.AdminKlinikeKonverter.toResponses;

@RestController
@EnableAutoConfiguration
@RequestMapping("/adminklinike")
public class AdminKlinikeController {
	
	@Autowired
	AdminKlinikeServiceImpl adminKlinikeService;

	
	@PostMapping
	public AdminKlinike save(@RequestBody AdminKlinike ak) {
		return adminKlinikeService.save(ak);
	}
	
	@PostMapping("/{id}")
	public AdminKlinike update(@RequestBody AdminKlinike ak) {
		return adminKlinikeService.save(ak);
	}
	@GetMapping("/{id}")
	public AdminKlinike getById(@RequestBody int id) {
		return adminKlinikeService.findById(id);
	}
	
	@GetMapping
	public List<AdminKlinike> findAll(){
		return adminKlinikeService.findAll();
	}
	@GetMapping("/adminik")
	public List<AdminKlinike> findAdminiKlinike(){
		return adminKlinikeService.findAdminK();
	}
	@GetMapping("/adminikc")
	public List<AdminKlinike> findAdminiCentra(){
		return adminKlinikeService.findAdminKC();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@RequestBody int id) {
		adminKlinikeService.delete(id);
	}

	@GetMapping("/svi")
	public List<AdminKlinikeResponse> vratiSveAdmineKlinike(){
		return toResponses(adminKlinikeService.getAll());
	}

	@PostMapping("/dodaj")
	@ResponseStatus(HttpStatus.CREATED)
	public void dodajAdminaKlinike(@Valid @RequestBody AdminKlinikeRequest adminKlinikeRequest){
		adminKlinikeService.dodaj(adminKlinikeRequest);
	}
	@PostMapping("/{id}/prihvatiregistraciju")
	public void prihvatiKorisnika(@PathVariable("id") Long id){
		adminKlinikeService.prihvati(id);
	}

	@PostMapping("{id}/odbijregistraciju")
	public void odbijKorisnika(@PathVariable("id") Long id, @Valid @RequestBody String message){
		adminKlinikeService.odbij(id, message);
	}
}
