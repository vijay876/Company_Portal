package com.Company_Portal.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Company_Portal.beans.Employee;

@RestController
@RequestMapping("/Company_Portal_API")
public class Employee_Controller {

	@GetMapping("/getEmployeeDetails")
	public List<Employee> getEmployeeDetails() {

		List<Employee> empList = Arrays.asList(new Employee(1, "vijay"), new Employee(2, "Ajay"),
				new Employee(3, "Uday"));
		return empList;
	}
}
