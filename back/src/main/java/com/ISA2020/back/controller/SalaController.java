package com.ISA2020.back.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ISA2020.back.model.Sala;
import com.ISA2020.back.service.SalaServiceImpl;

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

}
