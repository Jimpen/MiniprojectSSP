package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(DemoApplication.class, args);

		String connstr =
				"jdbc:sqlserver://localhost;databasename=Northwind;user=sqluser;password=password";

		Connection dbconn = null;
		try {
			dbconn = DriverManager.getConnection(connstr);

			Statement stmt = dbconn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS NumberOfCustomers  FROM dbo.Customers");

			while (rs.next()) {
				int count = rs.getInt("NumberOfCustomers");
				System.out.println("Number of customers" +count);
			}


		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (dbconn != null) dbconn.close();
		}
		System.out.println("Done");



	}


}
