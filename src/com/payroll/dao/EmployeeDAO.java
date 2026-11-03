package com.payroll.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.payroll.connection.DBConnection;

public class EmployeeDAO {
	public void addEmployee(Employee employee) {
		try {
			Connection con = DBConnection.getConnection();
			String query ="INSERT INTO EMPLOYEE(EMP_NAME,EMAIL,PHONE,DESIGNATION,DEPT_ID,JOINING_DATE,BASIC_SALARY"
					+ "VALUES(?,?,?,?,?,?,?)";
			PreparedStatement psmt =con.prepareStatement(query);
			psmt.setString(1, employee.getEmpName());
			psmt.setString(2, employee.getEmail());
			psmt.setString(3, employee.getPhone());
			psmt.setString(4, employee.getDesignation());
			psmt.setInt(5, employee.getDeptId());
			psmt.setDate(6, java.sql.Date.valueOf(employee.getJoiningdate()));
			psmt.setDouble(7, employee.getBasicsalary());
			int count = psmt.executeUpdate();
			if(count>0) {
				System.out.println("Employee Added Successfully");
			}
			psmt.close();
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void viewEmployees() {
		try {
			Connection con = DBConnection.getConnection();
			String query ="SELECT e.*,de.dept_name FROM EMPLOYEE e"
					+ "INNER JOIN DEPARTMENT d"
					+ "ON e.dept_id = d.dept_id";
			PreparedStatement psmt = con.prepareStatement(query);
			ResultSet rs= psmt.executeQuery();
			while(rs.next()) {
				System.out.println("Employee Id :  "+rs.getInt("emp_id"));
				System.out.println("Name :  "+rs.getString("emp_name"));
				System.out.println("Email :  "+rs.getString("email"));
				System.out.println("Phone :  "+rs.getString("phone"));
				System.out.println("Designation :  "+rs.getString("designation"));
				System.out.println("Department :  "+rs.getInt("dept_id"));
				System.out.println("Joining Date :  "+rs.getString("joining_date"));
				System.out.println("Basic Salary :  "+rs.getDouble("basic_salary"));
			}
			System.out.println("------------------------------------------------------------------------------------------------------");
			rs.close();
			psmt.close();
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void searchEmployee(int id) {
		try {
			Connection con = DBConnection.getConnection();
			String query ="";
			PreparedStatement psmt = con.prepareStatement(query);
			ResultSet rs= psmt.executeQuery();
			while(rs.next()) {
				System.out.println("Employee Id :  "+rs.getInt("emp_id"));
				System.out.println("Name :  "+rs.getString("emp_name"));
				System.out.println("Email :  "+rs.getString("email"));
				System.out.println("Phone :  "+rs.getString("phone"));
				System.out.println("Designation :  "+rs.getString("designation"));
				System.out.println("Department :  "+rs.getInt("dept_id"));
				System.out.println("Joining Date :  "+rs.getString("joining_date"));
				System.out.println("Basic Salary :  "+rs.getDouble("basic_salary"));
			}
			System.out.println("------------------------------------------------------------------------------------------------------");
			rs.close();
			psmt.close();
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
	public void updateEmployee(int id,String designation,double salary) {
		try {
			Connection con = DBConnection.getConnection();
			String query ="";
			PreparedStatement psmt = con.prepareStatement(query);
			ResultSet rs= psmt.executeQuery();
			while(rs.next()) {
				System.out.println("Employee Id :  "+rs.getInt("emp_id"));
				System.out.println("Name :  "+rs.getString("emp_name"));
				System.out.println("Email :  "+rs.getString("email"));
				System.out.println("Phone :  "+rs.getString("phone"));
				System.out.println("Designation :  "+rs.getString("designation"));
				System.out.println("Department :  "+rs.getInt("dept_id"));
				System.out.println("Joining Date :  "+rs.getString("joining_date"));
				System.out.println("Basic Salary :  "+rs.getDouble("basic_salary"));
			}
			System.out.println("------------------------------------------------------------------------------------------------------");
			rs.close();
			psmt.close();
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void deleteEmployee(int id) {
		try {
			Connection con = DBConnection.getConnection();
			String query ="";
			PreparedStatement psmt = con.prepareStatement(query);
			ResultSet rs= psmt.executeQuery();
			while(rs.next()) {
				System.out.println("Employee Id :  "+rs.getInt("emp_id"));
				System.out.println("Name :  "+rs.getString("emp_name"));
				System.out.println("Email :  "+rs.getString("email"));
				System.out.println("Phone :  "+rs.getString("phone"));
				System.out.println("Designation :  "+rs.getString("designation"));
				System.out.println("Department :  "+rs.getInt("dept_id"));
				System.out.println("Joining Date :  "+rs.getString("joining_date"));
				System.out.println("Basic Salary :  "+rs.getDouble("basic_salary"));
			}
			System.out.println("------------------------------------------------------------------------------------------------------");
			rs.close();
			psmt.close();
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
	
