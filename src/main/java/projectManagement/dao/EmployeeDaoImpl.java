package projectManagement.dao;

import projectManagement.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	Employee empArray[] = new Employee[5];
	public static int numOfEmployees = 0;
	
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		this.empArray[numOfEmployees] = emp;
		numOfEmployees++;
		return emp;
	}

	public Employee[] showEmployee() {
		// TODO Auto-generated method stub
		return empArray;
	}

	public Employee searchEmployee(int empId) {
		// TODO Auto-generated method stub
		for(int i=0; i<numOfEmployees; i++){
			if(empArray[i].getEmployeeId() == empId) 
				return empArray[i];
		}
		System.out.println("Employee NOT found!");
		return null;
	}

	public boolean deleteEmployee(int empId) {
		for(int i=0; i<numOfEmployees; i++) {
			if(empArray[i].getEmployeeId() == empId){
				while(i<(numOfEmployees-1)) {
					empArray[i] = empArray[i+1];	
				}
					
				numOfEmployees = numOfEmployees - 1;
				return true;
			}	
		}
			
		System.out.println("Employee NOT found!");
		return false;
	}

	public boolean updateEmployee(int empId) {

		for(int i=0; i<numOfEmployees; i++) {
			if(empArray[i].getEmployeeId() == empId) {
				System.out.println("Nothing's happening over here.");
			}
		}
	
		System.out.println("Employee NOT found!");
		return false;
	}

	public Employee addEmployeeToProject(Employee emp, int projectId) {
		emp.setEmpProjectId(projectId);
		return emp;
	}

}
