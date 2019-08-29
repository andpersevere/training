package projectManagement.dao;

import projectManagement.dto.Employee;
import projectManagement.dto.Project;

public class ProjectDaoImpl implements ProjectDao{
	Project[] projectArray = new Project[5];
	
	public Project addProject(Project prj) {
		// TODO Auto-generated method stub
		return prj;
	}

	public Project[] showProject() {
		// TODO Auto-generated method stub
		return projectArray;
	}

	public Project searchProject(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteProject(int empId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateProject(int empId) {
		// TODO Auto-generated method stub
		return false;
	}

	public Employee addEmployeeToProject(int projectId, Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

}
