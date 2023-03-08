package com.example.demo.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.project.entity.model;

public interface repo extends JpaRepository<model, Integer> {

}
