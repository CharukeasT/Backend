package com.example.sample.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.Repository.repository;
import com.example.sample.Table.cracker;

@RestController
@CrossOrigin
public class controller {
	@Autowired
	repository r;
	@PostMapping("/addCracker")
	public cracker addInfo(@RequestBody cracker c) {
		return r.save(c);
	}
	@GetMapping("/getCracker")
	public List<cracker> getInfo(){
		return r.findAll();
	}
	@PutMapping("/updateCracker")
	public cracker putInfo(@RequestBody cracker c) {
		return r.saveAndFlush(c);
	}
	@DeleteMapping("/deleteCracker")
	public String deleteInfo(@RequestBody cracker c) {
		r.delete(c);
		return "Cracker details deleted";
	}
}
