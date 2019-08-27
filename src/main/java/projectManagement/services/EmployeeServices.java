package projectManagement.services;

import projectManagement.dto.Employee;

public interface EmployeeServices {
	public abstract Employee addEmployee(Employee emp);
	public abstract Employee[] showEmployee();
	
}
