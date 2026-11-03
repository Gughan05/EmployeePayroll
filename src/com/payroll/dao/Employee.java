package com.payroll.dao;

public class Employee {
	private String empName;
	private String email;
	private String phone;
	private String designation;
	private int deptId;
	private String joiningdate;
	private double basicsalary;
	
	public String getEmpName() {
		return empName;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", email=" + email + ", phone=" + phone + ", designation=" + designation
				+ ", deptId=" + deptId + ", joiningdate=" + joiningdate + ", basicsalary=" + basicsalary + "]";
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(String joiningdate) {
		this.joiningdate = joiningdate;
	}
	public double getBasicsalary() {
		return basicsalary;
	}
	public void setBasicsalary(double basicsalary) {
		this.basicsalary = basicsalary;
	}
	
	

}
