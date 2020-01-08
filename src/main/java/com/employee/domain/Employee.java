package com.employee.domain;

public class Employee {
	private int empId;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private int departmentId;
	private int mailingAddress;
	private int physicalAddress;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public int getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(int mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public int getPhysicalAddress() {
		return physicalAddress;
	}

	public void setPhysicalAddress(int physicalAddress) {
		this.physicalAddress = physicalAddress;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNum="
				+ phoneNum + ", departmentId=" + departmentId + ", mailingAddress=" + mailingAddress
				+ ", physicalAddress=" + physicalAddress + "]";
	}

}
