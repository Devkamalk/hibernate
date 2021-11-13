package com.luv2code.jdbc;

import com.mysql.jdbc.Connection;

public class Testjdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "hbstudent";
		String pass = "hbstudent";
		try{
			System.out.println("connecting to database: " + jdbcUrl);
			Connection conn =  DriverManager.getConnection(jdbcUrl,user,pass);
			System.out.println("Connection successful");
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
