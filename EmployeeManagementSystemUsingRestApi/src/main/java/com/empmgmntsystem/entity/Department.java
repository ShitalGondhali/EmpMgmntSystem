package com.empmgmntsystem.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;



@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Department_ID")
	private int departmentId;
	
	@Column(name="Department_Name")
	private String departmentName;
	
	@Column(name="Department_Location")
	private String departmentLocation;

	@OneToMany(cascade = CascadeType.ALL)
	 @JoinTable(name = "Department_Employee", 
     joinColumns = @JoinColumn(name = "Employee_Id"),
     inverseJoinColumns = @JoinColumn(name = "Department_ID"))
    private Set<Employee> employee;
	
	
	
	

	public Department(int departmentId, String departmentName, String departmentLocation,
			Set<com.empmgmntsystem.entity.Employee> employee) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentLocation = departmentLocation;
		this.employee = employee;
	}
	
	

	public Department() {
		super();
	}



	public Set<Employee> getEmployee() {
		return employee;
	}



	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}



	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentLocation() {
		return departmentLocation;
	}

	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}

	
}
