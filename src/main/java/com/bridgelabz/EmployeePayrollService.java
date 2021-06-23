package com.bridgelabz;

import java.sql.SQLException;

public class EmployeePayrollService {
    DatabaseConnection con = new DatabaseConnection();

    public String connect() throws ClassNotFoundException, SQLException {
        return con.connectionToDatabase();
    }
}
