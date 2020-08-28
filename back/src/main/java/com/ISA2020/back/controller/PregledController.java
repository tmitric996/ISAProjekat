package com.ISA2020.back.controller;

import java.util.List;

import com.ISA2020.back.request.PregledRequest;
import com.ISA2020.back.response.PregledResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.ISA2020.back.model.Pregled;
import com.ISA2020.back.service.PregledServiceImpl;

import javax.validation.Valid;

import static com.ISA2020.back.converter.PregledConverter.toResponses;

@RestController
@EnableAutoConfiguration
@RequestMapping("/pregled")
public class PregledController {

	@Autowired
	PregledServiceImpl pregledService;
	
	@PostMapping
	public Pregled save(@RequestBody Pregled p) {
		return pregledService.save(p);
	}
	@PostMapping("/{id}")
	public Pregled update(@RequestBody Pregled p) {
		return pregledService.save(p);
	}
	@GetMapping
	public List<Pregled> findAll(){
		return pregledService.findAll();
	}
	@GetMapping("/{id}")
	public Pregled findById(@RequestBody int id){
		return pregledService.findById(id);
	}

	@GetMapping("/svi")
	public List<PregledResponse> vratiSvePreglede(){
		return toResponses(pregledService.getAll());
	}

	//kreiraj novi pregled
	@PostMapping("/dodaj")
	@ResponseStatus(HttpStatus.CREATED)
	public void kreirajPregled(@Valid @RequestBody PregledRequest pregledRequest){
		pregledService.dodaj(pregledRequest);
	}

	@PutMapping("/{id}/izmeni")
	@ResponseStatus(HttpStatus.OK)
	public void izmeniPregled(@Valid @RequestBody PregledRequest pregledRequest, @PathVariable("id") Long id){
		pregledService.izmeni(pregledRequest, id);
	}

	
}
