package projectManagement.dto;

public class Department {
	private Integer departmentId;
	private String departmentName;
	
	public Department() {
		
	}
	public Department(Integer departmentId, String departmentName) {
		super();
		this.setDepartmentId(departmentId);
		this.setDepartmentName(departmentName);
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
}
