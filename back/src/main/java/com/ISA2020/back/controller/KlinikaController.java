package com.ISA2020.back.controller;

import com.ISA2020.back.request.KlinikaRequest;
import com.ISA2020.back.response.KlinikaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.ISA2020.back.model.Klinika;
import com.ISA2020.back.service.KlinikaServiceImpl;

import javax.validation.Valid;
import java.util.List;

import static com.ISA2020.back.converter.KlinikaConverter.toResponses;


@RestController
@EnableAutoConfiguration
@RequestMapping("/klinika")
public class KlinikaController {

	
	@Autowired
	KlinikaServiceImpl klinikaService;
	
	@PostMapping("/save")
	public Klinika saveKlinika(@RequestBody Klinika k) {
		return klinikaService.saveKlinika(k); 
	}

	@GetMapping("/sve")
	public List<KlinikaResponse> vratiSveKlinike(){
		return toResponses(klinikaService.getAll());
	}

	@PostMapping("/dodaj")
	@ResponseStatus(HttpStatus.CREATED)
	public void registrujKlinike(@Valid @RequestBody KlinikaRequest klinikaRequest){
		klinikaService.dodaj(klinikaRequest);
	}
}
