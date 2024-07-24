package com.example.project.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.emp.entity.EmployeeEntity;
import com.example.project.emp.repository.EmployeeRepository;
import com.example.project.emp.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/")
public class EmplyeeController {

	@Autowired
	private EmployeeRepository emprepo;
	
	//Get all employees
	@GetMapping("/findall")
	public List<EmployeeEntity>getAllEmplyees(){
		return emprepo.findAll();
	}
}