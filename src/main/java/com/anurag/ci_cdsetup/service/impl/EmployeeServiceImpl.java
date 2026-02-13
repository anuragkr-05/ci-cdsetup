package com.anurag.ci_cdsetup.service.impl;

import org.springframework.stereotype.Service;

import com.anurag.ci_cdsetup.dtos.EmployeeRequestDTO;
import com.anurag.ci_cdsetup.dtos.EmployeeResponseDTO;
import com.anurag.ci_cdsetup.entity.Employee;
import com.anurag.ci_cdsetup.repository.EmployeeRepository;
import com.anurag.ci_cdsetup.service.IEmployee;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements IEmployee{
	
	private final EmployeeRepository employeeRepository;

	@Override
	public EmployeeResponseDTO createEmployee(EmployeeRequestDTO request) {
		
		Employee employee = Employee.builder()
									.name(request.getName())
									.salary(request.getSalary())
									.designation(request.getDesignation())
									.build();
		
		Employee savedEmp = employeeRepository.save(employee);
		
		return EmployeeResponseDTO.builder()
													.name(savedEmp.getName())
													.salary(savedEmp.getSalary())
													.designation(savedEmp.getDesignation())
													.build();
	}

}
