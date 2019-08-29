package projectManagement.services;

import projectManagement.dao.ProjectDao;
import projectManagement.dao.ProjectDaoImpl;
import projectManagement.dto.Employee;
import projectManagement.dto.Project;

public class ProjectServiceImpl implements ProjectServices{
	

	ProjectDao dao = new ProjectDaoImpl();
	public Project addProject(Project prj) {
		// TODO Auto-generated method stub
		return dao.addProject(prj);
	}

	public Project[] showProject() {
		
		// TODO Auto-generated method stub
		return dao.showProject();
	}

	public Project searchProject(int projectId) {
		// TODO Auto-generated method stub
		return dao.searchProject(projectId);
	}

	public boolean deleteProject(int projectId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateProject(int projectId) {
		// TODO Auto-generated method stub
		return false;
	}

	public Employee addEmployeeToProject(int projectId, Employee emp) {
		// TODO Auto-generated method stub
		return null;
	} 
	
}
