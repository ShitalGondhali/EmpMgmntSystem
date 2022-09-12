package com.empmgmntsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
public class Employee 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Employee_Id")
	private int employeeId;
	
	@Column(name="Employee_FirstName")
	private String employeeFirstName;
	
	@Column(name="Employee_LastName")
	private String employeeLastName;
	
	@Column(name="Employee_Address")
	private String employeeAddress;
	
	@Column(name="Employee_Salary")
	private String employeeSalary;
	
	@Column(name="Employee_EmailId")
	private String employeeEmailId;
	
	@Column(name="Employee_MobileNo")
	private String employeeMobileNo;
	
	
	@ManyToOne
	
	@JoinColumn(name = "departmentId")
	private Department department;
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	

	public Employee(int employeeId, String employeeFirstName, String employeeLastName, String employeeAddress,
			String employeeSalary, String employeeEmailId, String employeeMobileNo, Department department) {
		super();
		this.employeeId = employeeId;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.employeeAddress = employeeAddress;
		this.employeeSalary = employeeSalary;
		this.employeeEmailId = employeeEmailId;
		this.employeeMobileNo = employeeMobileNo;
		this.department = department;
	}
	
	
	public Employee() {
		super();
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(String employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeEmailId() {
		return employeeEmailId;
	}

	public void setEmployeeEmailId(String employeeEmailId) {
		this.employeeEmailId = employeeEmailId;
	}

	public String getEmployeeMobileNo() {
		return employeeMobileNo;
	}

	public void setEmployeeMobileNo(String employeeMobileNo) {
		this.employeeMobileNo = employeeMobileNo;
	}
	
	
	
}
