package projectManagement.dto;

import java.math.BigInteger;

public class Project {
	private BigInteger projectId;
	private String projectName;
	private Employee[] employeeList;
	
	public Project() {
		
	}
	public Project(BigInteger projectId, String projectName, Employee[] employeeList) {
		super();
		this.setProjectId(projectId);
		this.setProjectName(projectName);
		this.setEmployeeList(employeeList);
	}
	public Employee[] getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(Employee[] employeeList) {
		this.employeeList = employeeList;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public BigInteger getProjectId() {
		return projectId;
	}
	public void setProjectId(BigInteger projectId) {
		this.projectId = projectId;
	}
	
}
