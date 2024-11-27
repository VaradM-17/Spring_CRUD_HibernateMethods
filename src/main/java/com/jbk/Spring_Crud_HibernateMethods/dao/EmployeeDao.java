package com.jbk.Spring_Crud_HibernateMethods.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.Spring_Crud_HibernateMethods.entity.Employee;

@Repository
public class EmployeeDao {
	@Autowired
	SessionFactory factory;

	public String insertData(Employee e) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		ss.persist(e);
		tr.commit();
		ss.close();

		return "Data Inserted...";

	}

	public String updateData(Employee e, int eid) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		Employee emp = ss.get(Employee.class, eid);

		e.setEname(e.getEname());
		e.setEage(e.getEage());
		e.setEsalary(e.getEsalary());

		ss.merge(emp);
		tr.commit();
		ss.close();

		return "Data Updated...";

	}

	public String deleteData(int eid) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		
		Employee e = ss.get(Employee.class, eid);
		
		return "Data Deleted...";

	}

}
