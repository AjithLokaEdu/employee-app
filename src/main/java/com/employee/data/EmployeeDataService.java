package com.employee.data;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.IOUtils;

import com.employee.domain.Employee;
import com.google.gson.Gson;

public class EmployeeDataService {
	
  public List<Employee> getEmployees() throws IOException{
	  
	   InputStream empdataStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("employee-data.json");
	   String jsonString = IOUtils.toString(empdataStream, StandardCharsets.UTF_8);
	   
	   Gson gson = new Gson();
	   Employee[] employeeArray = gson.fromJson(jsonString, Employee[].class);  
	   return   Arrays.asList(employeeArray);
	  //return null;
  }
  
}
