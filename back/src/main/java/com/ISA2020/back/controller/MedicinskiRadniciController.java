package com.ISA2020.back.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ISA2020.back.model.MedicinskiRadnici;
import com.ISA2020.back.service.MedicinskiRadniciServiceImpl;

@RestController
@EnableAutoConfiguration
@RequestMapping("/medradnik")
public class MedicinskiRadniciController {

	@Autowired
	MedicinskiRadniciServiceImpl medRadnikService;
	
	@PostMapping()
	public MedicinskiRadnici save(@RequestBody MedicinskiRadnici mr) {
		return medRadnikService.save(mr);
	}
	
	@GetMapping()
	public List<MedicinskiRadnici> findAll(){
		return medRadnikService.findAll();
	}
	
	@GetMapping("/lekar")
	public List<MedicinskiRadnici> findLekari(){
		return medRadnikService.findLekari();
	}
	@GetMapping("/tehnicar")
	public List<MedicinskiRadnici> findTehnicari(){
		return medRadnikService.findTehnicari();
	}
	
	@GetMapping("/{id}")
	public MedicinskiRadnici findById(@RequestBody int i) {
		return medRadnikService.findById(i);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@RequestBody int i) throws IOException {
		medRadnikService.delete(i);
	}

}
