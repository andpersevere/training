package projectManagement.dto;

public class Employee {
	private int employeeId;
	private String empName;
	private Double empSalary;
	private Department empDepartment;
	
	public Employee() {
		
	}
	public Employee(int employeeId, String empName, Double empSalary, Department empDepartment) {
		super();
		this.setEmployeeId(employeeId);
		this.setEmpName(empName);
		this.setEmpSalary(empSalary);
		this.setEmpDepartment(empDepartment);
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int empId) {
		this.employeeId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	public Department getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(Department empDepartment) {
		this.empDepartment = empDepartment;
	}
	
}
