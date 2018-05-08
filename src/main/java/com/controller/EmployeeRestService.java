package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;

@RestController("/")
public class EmployeeRestService 
{
	@RequestMapping(value = "/listEmps", method = RequestMethod.GET)
	public List<Employee> listEmployess()
	{
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(100, "AAA"));
		employees.add(new Employee(101, "BBB"));
		employees.add(new Employee(102, "CCC"));
		
		return employees;
	}
}
