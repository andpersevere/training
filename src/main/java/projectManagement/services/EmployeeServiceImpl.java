package projectManagement.services;

import projectManagement.dao.EmployeeDao;
import projectManagement.dao.EmployeeDaoImpl;
import projectManagement.dto.Employee;
import projectManagement.dto.Project;

public class EmployeeServiceImpl implements EmployeeServices{
	EmployeeDao dao = new EmployeeDaoImpl();


	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.addEmployee(emp);
	}

	public Employee[] showEmployee() {
		// TODO Auto-generated method stub
		return dao.showEmployee();
	}

	public Employee searchEmployee(int empId) {
		// TODO Auto-generated method stub
		return dao.searchEmployee(empId);
	}

	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(empId);
	}

	public boolean updateEmployee(int empId) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(empId);
	}
}
