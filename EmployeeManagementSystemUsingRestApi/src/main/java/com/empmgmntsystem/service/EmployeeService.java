package com.empmgmntsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empmgmntsystem.entity.Employee;
import com.empmgmntsystem.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	//1.fetching all employees
	public List<Employee> getAllEmployee()
	{
		return employeeRepository.findAll();
	}
	
	//2.fetching employee by id
	public Optional<Employee> getEmployee(int employeeId)
	{
		return employeeRepository.findById(employeeId);
	}
	
	//3.inserting employee
	public Employee addEmployee(Employee employee) 
	{
		return employeeRepository.save(employee);
	}
	
	//4.updating employee by id
	public Employee updateEmployee(Employee emp,int employeeId)
	{
		return employeeRepository.save(emp);
	}
	
	//5.deleting all employees
	public void deleteAllEmployees()
	{
		employeeRepository.deleteAll();
	}
	
	//6.deleting employee by id
	public void deleteById(int employeeId)
	{
		employeeRepository.deleteById(employeeId);
	}
	
	//7.patching/updating employee by id
	public Employee patchEmployee(Employee emp,int employeeId)
	{
		return employeeRepository.save(emp);
	}
	
	/*//8.searching by employee id
	public Employee searchById(int employeeId)
	{
		return employeeRepository.findById(employeeId).get();
	} */
}