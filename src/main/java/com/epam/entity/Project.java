package com.epam.entity;

import java.io.Serializable;
import java.util.List;

public class Project implements Serializable {

	private Integer projectID;
	private String projectName;
	private String projectInfo;
	private List<Employee> employees;

	public Project() {}

	public Project(Integer projectID, String projectName, String projectInfo,
			List<Employee> employees) {
		this.projectID = projectID;
		this.projectName = projectName;
		this.projectInfo = projectInfo;
		this.employees = employees;
	}
}
