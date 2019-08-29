package projectManagement;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import projectManagement.services.EmployeeServiceImpl;
import projectManagement.services.EmployeeServices;
class ProjectManagementTest {
	EmployeeServices service = new EmployeeServiceImpl();
	@Test
	void test() {
		System.out.println("Hello");
	}

}
