package projectManagement.dao;

import projectManagement.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	Employee empArray[] = new Employee[5];
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		this.empArray[0] = emp;
		return emp;
	}

	public Employee[] showEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

}
