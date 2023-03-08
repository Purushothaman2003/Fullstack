package com.example.demo.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.project.entity.model;
//import com.example.demo.project.repo.repo;
import com.example.demo.project.service.service;
@RestController
@CrossOrigin
public class controller {
	
	@Autowired
	service s;

	@PostMapping("/user")
	public model addDetails(@RequestBody model m) {
		return s.add(m);
	}
	
	
	
	@CrossOrigin
	
	@GetMapping("/users")
	public List<model> showDetails() {
		return s.getDetails();

	}
	@GetMapping("/user/{id}")  
	private model getBooks(@PathVariable("id") int id)   
	{  
	return s.getBooksById(id);  
	}  
	

	
	@PutMapping("/user/{id}")
	public model updateInfo(@PathVariable("id") int id) {
		return s.updateDetails(id);
	}
	
	
	
	
	@DeleteMapping("/user/{id}")
	public void deleteInfo(@PathVariable ("id") int id) {
		s.deletemodelById(id);
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
