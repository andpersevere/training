package projectManagement.ui;

import java.util.Scanner;

import projectManagement.dto.*;
import projectManagement.services.*;

public class MyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int empId;
		String empName = null;
		double empSalary;
		String deptName;
		int deptId;
		
		EmployeeServices service = new EmployeeServiceImpl();
		Scanner scr = new Scanner(System.in);
		
		int counter;
		while(true) {
			System.out.println("Give the total number of Employees: ");
			counter = scr.nextInt();
			if(counter>5)
				System.out.println("The number of employees exceeds expectation.");
			else
				break;
		}
		
		Employee empArray[] = service.showEmployee();
		Employee emp;
		Department dep;
		
		for(int i=0; i<counter; i++) {
			
			System.out.println("Enter the Employee ID: ");
			empId = scr.nextInt();
			
			System.out.println("Enter the Employee name: ");
			empName = scr.next();
			
			System.out.println("Enter the Employee Salary: ");
			empSalary = scr.nextDouble();
			
			System.out.println("Enter the Department name: ");
			deptName = scr.next();
			
			System.out.println("Enter the Department ID: ");
			deptId = scr.nextInt();
			
			dep = new Department();
			dep.setDepartmentId(deptId);
			dep.setDepartmentName(deptName);
			
			emp = new Employee();
			emp.setEmployeeId(empId);
			emp.setEmpName(empName);
			emp.setEmpSalary(empSalary);
			emp.setEmpDepartment(dep);
			
			service.addEmployee(emp);
			System.out.println(empArray[i].getEmpName());
			
			
		}
		System.out.println(service.showEmployee());
		
		
		int key;
		System.out.println("Input the operation you want to perform on Employee:\n1.Search\n2.Delete\n3.Update");
		key = scr.nextInt();
		System.out.println("Input the Employee ID");
		empId = scr.nextInt();
		switch(key) {
		
			case 1: 
				emp = service.searchEmployee(empId);
				System.out.println("\nEmployee ID: "+ emp.getEmployeeId() +"\nEmployee Name:"+ emp.getEmpName());
				break;
			case 2:
				boolean successProcess = service.deleteEmployee(empId);
				System.out.println("The process was seccessful: "+successProcess);
				break;
			case 3:
				boolean successProcess1 = service.updateEmployee(empId);
				System.out.println("The process was seccessful: "+successProcess1);
				break;
			default:
				System.out.println("Invalid response");
		}
		
		
		/*****************Project Employee one to many operation*****************/
		
		
		
		close(scr);
	}

	private static void close(Scanner scr) {
		// TODO Auto-generated method stub
		
	}

}
