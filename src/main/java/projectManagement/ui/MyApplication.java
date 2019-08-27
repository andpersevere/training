package projectManagement.ui;

import java.util.Scanner;

import projectManagement.dto.*;
import projectManagement.services.*;

public class MyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeServices service = new EmployeeServiceImpl();
		int empId;
		String empName = null;
		double empSalary;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the Employee ID: ");
		empId = scr.nextInt();
		
		System.out.println("Enter the Employee name: ");
		empName = scr.next();
		
		System.out.println("Enter the Employee Salary: ");
		empSalary = scr.nextDouble();
		
		System.out.println("Enter the Department name: ");
		String deptName = scr.next();
		
		System.out.println("Enter the Department ID: ");
		int deptId = scr.nextInt();
		
		Department dep = new Department();
		dep.setDepartmentId(deptId);
		dep.setDepartmentName(deptName);
		
		Employee emp = new Employee();
		emp.setEmployeeId(empId);
		emp.setEmpName(empName);
		emp.setEmpSalary(empSalary);
		emp.setEmpDepartment(dep);
		
		service.addEmployee(emp);
		Employee empArray[] = service.showEmployee();
		for(int i=0; i<empArray.length; i++) {
			System.out.println(empArray[i].getEmpName());
		}
		close(scr);
	}

	private static void close(Scanner scr) {
		// TODO Auto-generated method stub
		
	}

}
