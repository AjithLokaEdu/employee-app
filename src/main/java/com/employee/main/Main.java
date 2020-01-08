package com.employee.main;

import java.io.IOException;

import com.employee.service.EmployeeService;

public class Main {
 
	public static void main(String[] args) throws IOException {
		EmployeeService employeeService = new EmployeeService();
		System.out.println(employeeService.getEmployeeById(12345));
	}
}
