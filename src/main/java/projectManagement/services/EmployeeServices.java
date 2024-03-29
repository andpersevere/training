package projectManagement.services;

import projectManagement.dto.Employee;


public interface EmployeeServices {
	public abstract Employee addEmployee(Employee emp);
	public abstract Employee[] showEmployee();
	public abstract Employee searchEmployee(int empId);
	public abstract boolean deleteEmployee(int empId);
	public abstract boolean updateEmployee(int empId);
	
}
