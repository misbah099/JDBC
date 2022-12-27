package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//reading the table using jdbc
public class jdbctest {

	public static void main(String[] args) {
try {
	//register driver step no 1
	Class.forName("com.mysql.cj.jdbc.Driver");
	//get connection step 2
	Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/misbahdb","root","root3119");
	//create statement step 3
	Statement stmt=conn.createStatement();
	//excecute query fetch data from data from database step no 4
	ResultSet rs=stmt.executeQuery("select* from Student_details");
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
