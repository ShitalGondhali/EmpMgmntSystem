package com.empmgmntsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empmgmntsystem.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

	//List<Employee> findByName(String empName);
}