package com.ISA2020.back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ISA2020.back.model.Klinika;
import com.ISA2020.back.service.KlinikaServiceImpl;

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
}
