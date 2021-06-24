package com.bridgelabz;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeePayrollService {
    DatabaseConnection con = new DatabaseConnection();

    public String connect() throws ClassNotFoundException, SQLException {
        return con.connectionToDatabase();
    }

    public int dataInTable() throws SQLException, ClassNotFoundException {
        connect();
        Statement statement = con.connection.createStatement();
        ResultSet resultSet = statement.executeQuery( "SELECT * FROM Employee_payroll");
        int count = 0;
        while (resultSet.next()) {
            count++;
            System.out.println("ID:"+resultSet.getString(1) +
                    " Name: " + resultSet.getString(2) +
                    " Salary " + resultSet.getString(3)+
                    " Start " + resultSet.getString(4)
                    );
        }
        con.connection.close();
        return count;
    }

    public int updateTable() throws SQLException, ClassNotFoundException {
        connect();
        Statement statement = con.connection.createStatement();
        int resultSet = statement.executeUpdate( "UPDATE Employee_payroll " +
                "SET salary = 3000000 " +
                "WHERE Name = 'Pawan'");
        con.connection.close();
        return resultSet;
    }

}
