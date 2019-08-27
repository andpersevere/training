package projectManagement.dao;

import projectManagement.dto.Employee;

public interface EmployeeDao {
	public abstract Employee addEmployee(Employee emp);
	public abstract Employee[] showEmployee();
	
}
