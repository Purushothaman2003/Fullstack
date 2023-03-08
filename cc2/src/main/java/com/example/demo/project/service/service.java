package com.example.demo.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.project.entity.model;
//import com.example.demo.model.model;
import com.example.demo.project.repo.repo;
//import com.example.demo.repository.repository;

@Service
public class service {
	@Autowired
	repo r;
	
	public model add(model m) {
		return r.save(m);
//		return "Added";
	}
	
	public List<model> getDetails() {
		return r.findAll();
	}
	
	public model updateDetails(model e1) {
		return r.saveAndFlush(e1);
	}

	public model getBooksById(int id)   
	{  
	return r.findById(id).get();  
	}  

	public model updateDetails(int id)   
	{  
	return r.findById(id).get();  
	}
	public void deletemodelById(int id) {
		r.deleteById(id);
	
		
	}



}
