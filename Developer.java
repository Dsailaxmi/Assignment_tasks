package com.mondee;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Developer extends Employee {
	@Column(name="name")
	private String name;
	@Column(name="address")
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
