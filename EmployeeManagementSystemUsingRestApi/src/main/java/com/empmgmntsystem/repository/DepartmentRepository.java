package com.empmgmntsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empmgmntsystem.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department,Integer>{

}