package com.beans;

public class Employee {

	private String name;
	private long id;
	private String contactNumber;

	public Employee() {
		super();
	}

	public Employee(String name, long id, String contactNumber) {
		super();
		this.name = name;
		this.id = id;
		this.contactNumber = contactNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

}
