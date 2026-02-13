package com.anurag.ci_cdsetup.service;

import com.anurag.ci_cdsetup.dtos.EmployeeRequestDTO;
import com.anurag.ci_cdsetup.dtos.EmployeeResponseDTO;

public interface IEmployee {

	EmployeeResponseDTO createEmployee(EmployeeRequestDTO request);

}
