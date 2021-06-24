package com.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class EmployeePayrollTest {


    @Test
    public void givenDatabaseSetupConnectionReturnConnected() {
        EmployeePayrollService employeePayroll = new EmployeePayrollService();
        try {
            String result = employeePayroll.connect();
            Assert.assertEquals("Connected..", result);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenDatabaseRetrieveDataInTable() {
        EmployeePayrollService employeePayroll = new EmployeePayrollService();
        try {
            int result = employeePayroll.dataInTable();
            Assert.assertEquals(5, result);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenDatabaseUpdateDataInTable() {
        EmployeePayrollService employeePayroll = new EmployeePayrollService();
        try {
            int result = employeePayroll.updateTable();
            Assert.assertEquals(1, result);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
