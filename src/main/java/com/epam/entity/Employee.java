package com.epam.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Employee")
public class Employee implements Serializable {

	private Integer employeeID;
	private Address address;
	private EmployeeStatus employeeStatus;
	private Personal personal;
	private List<Project> projects;

	public Employee() {}

	public Employee(Integer employeeID, Address address, EmployeeStatus employeeStatus, Personal personal,
			List<Project> projects) {
		this.employeeID = employeeID;
		this.address = address;
		this.employeeStatus = employeeStatus;
		this.personal = personal;
		this.projects = projects;
	}

	@Id
	@Column(name = "employeeID", unique = true, nullable = false)
	public Integer getEmployeeID()
	{
		return employeeID;
	}

	public void setEmployeeID(Integer employeeID)
	{
		this.employeeID = employeeID;
	}

	@Embedded
	@AttributeOverrides(value = {
			@AttributeOverride(name = "city", column = @Column(name = "city")),
			@AttributeOverride(name = "country", column = @Column(name = "country"))
	})
	public Address getAddress()
	{
		return address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	public EmployeeStatus getEmployeeStatus()
	{
		return employeeStatus;
	}

	public void setEmployeeStatus(EmployeeStatus employeeStatus)
	{
		this.employeeStatus = employeeStatus;
	}

	public Personal getPersonal()
	{
		return personal;
	}

	public void setPersonal(Personal personal)
	{
		this.personal = personal;
	}

	public List<Project> getProjects()
	{
		return projects;
	}

	public void setProjects(List<Project> projects)
	{
		this.projects = projects;
	}
}
