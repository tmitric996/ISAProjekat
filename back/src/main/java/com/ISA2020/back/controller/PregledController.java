package com.ISA2020.back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ISA2020.back.model.Pregled;
import com.ISA2020.back.service.PregledServiceImpl;

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
	
}
