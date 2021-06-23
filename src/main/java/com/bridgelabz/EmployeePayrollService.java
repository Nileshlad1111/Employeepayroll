package com.bridgelabz;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeePayrollService {
    DatabaseConnection con = new DatabaseConnection();

    public String connect() throws ClassNotFoundException, SQLException {
        return con.connectionToDatabase();
    }

}
