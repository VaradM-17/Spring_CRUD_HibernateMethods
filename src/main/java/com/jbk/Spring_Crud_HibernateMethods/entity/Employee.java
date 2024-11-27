package com.jbk.Spring_Crud_HibernateMethods.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int eid;
	private String ename;
	private int eage;
	private String esalary;

	public Employee() {
		super();
	}

	public Employee(int eid, String ename, int eage, String esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
		this.esalary = esalary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	public String getEsalary() {
		return esalary;
	}

	public void setEsalary(String esalary) {
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", esalary=" + esalary + "]";
	}

}
