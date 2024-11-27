package com.jbk.Spring_Crud_HibernateMethods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.Spring_Crud_HibernateMethods.entity.Employee;
import com.jbk.Spring_Crud_HibernateMethods.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class EmloyeeController {

	@Autowired
	EmployeeService employeeservice;

	@PostMapping("/insertdata")
	public String insertData(@RequestBody Employee e) {
		String msg = employeeservice.insertData(e);
		return msg;
	}

	@PutMapping("/updatedata/{eid}")
	public String updateData(@RequestBody Employee e, @PathVariable int eid) {
		String msg = employeeservice.updateData(e, eid);
		return msg;
	}

	@DeleteMapping("/deletedata/{eid}")
	public String deletedata(int eid) {
		String msg = employeeservice.deleteData(eid);
		return msg;
	}

	@GetMapping("/displayalldata")
	public List<Employee> displayallData() {
		List<Employee> list = employeeservice.displayallData();
		return list;
	}

	@GetMapping("/displaysingledata/{eid}")
	public Employee fetchsingleData(int eid) {
		Employee e = employeeservice.fetchsingleData(eid);
		return e;
	}

}
