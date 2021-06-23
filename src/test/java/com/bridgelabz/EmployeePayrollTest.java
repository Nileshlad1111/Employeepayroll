package com.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class EmployeePayrollTest {

    @Test
    public void givenDatabase() {
        EmployeePayrollService employeePayroll = new EmployeePayrollService();
        try {
            String result = employeePayroll.connect();
            Assert.assertEquals("Connected..", result);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
