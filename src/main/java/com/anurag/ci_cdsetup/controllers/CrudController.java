package com.anurag.ci_cdsetup.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anurag.ci_cdsetup.dtos.EmployeeRequestDTO;
import com.anurag.ci_cdsetup.dtos.EmployeeResponseDTO;
import com.anurag.ci_cdsetup.service.IEmployee;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("ap1/v1/crud")
@RequiredArgsConstructor
public class CrudController {
	
	
	private final IEmployee employee;
	
	@PostMapping
	public ResponseEntity<EmployeeResponseDTO> createEmployee(@RequestBody EmployeeRequestDTO request){
		
		return new ResponseEntity<>(employee.createEmployee(request),HttpStatus.CREATED);
	}
	
}
