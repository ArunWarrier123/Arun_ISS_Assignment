package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCPractice {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprac", "root", "123456");

			PreparedStatement ps = con.prepareStatement("insert into employees(name, domain , stipend) values(?,?,?)");

			ps.setString(1, "Arun");
			ps.setString(2, "Development");
			ps.setInt(3, 30000);

			int count = ps.executeUpdate();

			if (count > 0) {
				System.out.println("succesfully inserted");
			} else {
				System.out.println("unsuccesfull");
			}
		} catch (Exception e) {
			System.out.println("exception" + e.getMessage());
		}
	}

}
