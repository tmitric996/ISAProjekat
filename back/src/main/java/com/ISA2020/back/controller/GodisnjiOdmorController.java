package com.ISA2020.back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ISA2020.back.model.GodisnjiOdmor;
import com.ISA2020.back.service.GodisnjiOdmorServiceImpl;

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
}
