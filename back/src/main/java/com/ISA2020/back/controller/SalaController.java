package com.ISA2020.back.controller;

import java.io.IOException;
import java.util.List;

import com.ISA2020.back.request.SalaRequest;
import com.ISA2020.back.response.SalaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.ISA2020.back.model.Sala;
import com.ISA2020.back.service.SalaServiceImpl;

import javax.validation.Valid;

import static com.ISA2020.back.converter.SalaConverter.toResponses;

@RestController
@EnableAutoConfiguration
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/sala")
public class SalaController {
	
	@Autowired
	SalaServiceImpl salaService;
	
	@PostMapping()
	public Sala save(@RequestBody Sala sala) {
		return salaService.saveSala(sala);
	}
	
	@GetMapping()
	public List<Sala> findAll(){
		return salaService.findAll();
	}
	
	@GetMapping("/{id}")
	public Sala findById(@RequestBody int i) {
		return salaService.findById(i);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@RequestBody int i) throws IOException {
		salaService.deleteSala(i);
	}
	
	@PostMapping("/{id}")
	public void changeSala(@RequestBody Sala s) {
		salaService.saveSala(s);
	}

	@GetMapping("/sve")
	public List<SalaResponse> vratiSveSale(){
		return toResponses(salaService.getAll());
	}

	@PostMapping("/dodaj")
	@ResponseStatus(HttpStatus.CREATED)
	public void kreirajSalu(@Valid @RequestBody SalaRequest salaRequest){
		//requestbody, pathvariable, requestparametar
		//requestbody uzima vrednosti koje su namapirane sa modelom
		//pathvariable ukazuje na to da parametar neke metode treba da se poveze sa templejtom URI varijable
		//requestparameter
		salaService.dodaj(salaRequest);
	}
}
