package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//insert the data into the table using jdbc
public class insertjdbc {
public static void main(String[] args) {
	try {
		//register driver step no 1
		Class.forName("com.mysql.cj.jdbc.Driver");
		//get connection step 2
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/misbahdb","root","root3119");
		//create statement step 3
		Statement stmt=conn.createStatement();
		//inserting data into the table step4
		stmt.executeUpdate
		("insert into Student_details values(12,'king',22,345363633,'king@gmail.com','London','MCA',4000.5)");
		System.out.println("Inserting done");
}catch(Exception e) {
	System.out.println(e);
}
}}
