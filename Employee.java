package com.mondee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity(name="employee")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Employee {

	@Id
	private int eid;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}



}