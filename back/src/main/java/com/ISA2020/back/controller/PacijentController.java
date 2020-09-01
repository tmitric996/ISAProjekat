package com.ISA2020.back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ISA2020.back.dto.UserRequest;
import com.ISA2020.back.model.Pacijent;
import com.ISA2020.back.service.PacijentServiceImpl;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/pacijenti")
public class PacijentController {
	
	@Autowired
	PacijentServiceImpl pacijentService;
	
	@PostMapping
	public Pacijent save(@RequestBody UserRequest ur) {
		return pacijentService.save(ur);
	}
	
	@GetMapping
	public List<Pacijent> findAll(){
		return pacijentService.findAll();
		}
	@GetMapping("/{id}")
	public Pacijent findbyId(@RequestBody int id) {
		return pacijentService.findById(Integer.toUnsignedLong(id));
	}
}
