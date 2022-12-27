package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcupdate {

	public static void main(String[] args) {
try {
		//register driver step no 1
		Class.forName("com.mysql.cj.jdbc.Driver");
		//get connection step 2
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/misbahdb","root","root3119");
		//create statement step 3
		Statement stmt=conn.createStatement();
		//update the existing table
		stmt.executeUpdate("update Student_details set sname='ROY' WHERE id=12");
		//delete record
		stmt.executeUpdate("delete from Student_details WHERE id=1");
		//execute query fetch data from database
		ResultSet rs=stmt.executeQuery("select*from Student_details");
		//iteration
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(6));
		}
		conn.close();
		
}catch(Exception e) {
	System.out.println(e);
}
}
}
	

