package com.empmgmntsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empmgmntsystem.entity.Department;
import com.empmgmntsystem.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	//1.fetching all department
	public List<Department> getAllDepartment()
	{
		return departmentRepository.findAll();
	}
	
	//2.fetching department by id
	public Optional<Department> getDepartment(int departmentId)
	{
		return departmentRepository.findById(departmentId);
	}
	
	
	public Department searchById(int deptId)
	{
		return departmentRepository.findById(deptId).get();
	}
	
	
	//3.inserting department
	public Department addDepartment(Department dept)
	{
		return departmentRepository.save(dept);
	}
	
	//4.updating department by id
	public Department updateDepartment(Department dept,int departmentId)
	{
		return departmentRepository.save(dept);
	}
	
	//5.deleting all departments
	public void deleteAllDepartments()
	{
		departmentRepository.deleteAll();
	}
	
	//6.deleting department by id
	public void deleteDepartment(int departmentId)
	{
		departmentRepository.deleteById(departmentId);
	}
	
	//7.patching/updating department by id
	public Department patchDepartment(Department dept,int departmentId)
	{
		return departmentRepository.save(dept);
	}
	
	
	
}