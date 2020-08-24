package com.ISA2020.back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ISA2020.back.model.AdminKlinike;
import com.ISA2020.back.service.AdminKlinikeServiceImpl;

@RestController
@EnableAutoConfiguration
@RequestMapping("/adminklinike")
public class AdminKlinikeController {
	
	@Autowired
	AdminKlinikeServiceImpl adminKlinikeService;
	
	@PostMapping
	public AdminKlinike save(@RequestBody AdminKlinike ak) {
		return adminKlinikeService.save(ak);
	}
	
	@PostMapping("/{id}")
	public AdminKlinike update(@RequestBody AdminKlinike ak) {
		return adminKlinikeService.save(ak);
	}
	@GetMapping("/{id}")
	public AdminKlinike getById(@RequestBody int id) {
		return adminKlinikeService.findById(id);
	}
	
	@GetMapping
	public List<AdminKlinike> findAll(){
		return adminKlinikeService.findAll();
	}
	@GetMapping("/adminik")
	public List<AdminKlinike> findAdminiKlinike(){
		return adminKlinikeService.findAdminK();
	}
	@GetMapping("/adminikc")
	public List<AdminKlinike> findAdminiCentra(){
		return adminKlinikeService.findAdminKC();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@RequestBody int id) {
		adminKlinikeService.delete(id);
	}
	

}
