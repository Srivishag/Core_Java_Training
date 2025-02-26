package com.celcom.day12;

public class Customer {
	private int id;
	private String name;
	private String dob;
	private String address;
	private String fatherName;
	private long aadharNumber;
	private int phoneNumber;

	public Customer(int id, String name, String dob, String address, String fatherName, long aadharNumber,
			int phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.fatherName = fatherName;
		this.aadharNumber = aadharNumber;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(int aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
