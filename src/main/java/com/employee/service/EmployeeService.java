package com.employee.service;

import java.io.IOException;
import java.util.List;

import com.employee.data.EmployeeDataService;
import com.employee.domain.Employee;

public class EmployeeService {

	public Employee getEmployeeById(int employeeId) throws IOException {
		EmployeeDataService employeeDataService = new EmployeeDataService();
		List<Employee> emplist = employeeDataService.getEmployees();
		System.out.println(emplist);
		return emplist.get(0);
	}

	public Employee getEmployeeBylastName(String lastName) {
		return null;
	}
	
}
