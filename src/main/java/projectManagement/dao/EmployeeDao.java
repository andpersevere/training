package projectManagement.dao;

import projectManagement.dto.Employee;

public interface EmployeeDao {
	public abstract Employee addEmployee(Employee emp);
	public abstract Employee[] showEmployee();
	public abstract Employee searchEmployee(int empId);
	public abstract boolean deleteEmployee(int empId);
	public abstract boolean updateEmployee(int empId);
	public abstract Employee addEmployeeToProject(Employee emp, int projectId);
	
}
