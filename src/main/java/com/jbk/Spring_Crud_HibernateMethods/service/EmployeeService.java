package com.jbk.Spring_Crud_HibernateMethods.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.Spring_Crud_HibernateMethods.dao.EmployeeDao;
import com.jbk.Spring_Crud_HibernateMethods.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao employeedao;

	public String insertData(Employee e) {
		String msg = employeedao.insertData(e);
		return msg;
	}

	public String updateData(Employee e, int eid) {
		String msg = employeedao.updateData(e, eid);
		return msg;
	}

	public String deleteData(int eid) {
		String msg = employeedao.deleteData(eid);
		return msg;
	}

	public List<Employee> displayallData() {
		List<Employee> list = employeedao.displayallData();
		return list;
	}

	public Employee fetchsingleData(int eid) {
		Employee e = employeedao.displaysingleData(eid);
		return e;
	}

}
