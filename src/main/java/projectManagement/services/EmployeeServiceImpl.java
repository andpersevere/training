package projectManagement.services;

import projectManagement.dao.EmployeeDao;
import projectManagement.dao.EmployeeDaoImpl;
import projectManagement.dto.Employee;

public class EmployeeServiceImpl implements EmployeeServices{
	EmployeeDao dao = new EmployeeDaoImpl();


	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.addEmployee(emp);
	}

	public Employee[] showEmployee() {
		// TODO Auto-generated method stub
		System.out.println("");
		return null;
	}}
