package com.ISA2020.back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ISA2020.back.model.Pacijent;
import com.ISA2020.back.service.PacijentServiceImpl;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/pacijenti")
public class PacijentController {
	
	@Autowired
	PacijentServiceImpl pacijentService;
	
	@PostMapping
	public Pacijent save(@RequestBody Pacijent p) {
		return pacijentService.save(p);
	}
	
	@GetMapping
	public List<Pacijent> findAll(){
		return pacijentService.findAll();
		}

}
