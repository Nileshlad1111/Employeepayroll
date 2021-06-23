package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Runner {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/payroll_service?useSSL=false";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "gopi";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        employeePayrollService.connect();
        employeePayrollService.dataInTable();
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(JDBC_URL, USER_NAME, PASSWORD);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
