package com.anurag.ci_cdsetup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anurag.ci_cdsetup.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
