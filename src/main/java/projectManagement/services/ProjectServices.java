package projectManagement.services;

import projectManagement.dto.Employee;
import projectManagement.dto.Project;

public interface ProjectServices {
	public abstract Project addProject(Project prj);
	public abstract Project[] showProject();
	public abstract Project searchProject(int empId);
	public abstract boolean deleteProject(int empId);
	public abstract boolean updateProject(int empId);
	public Employee addEmployeeToProject(int projectId, Employee emp);

}
