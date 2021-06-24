package com.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.sql.Date;
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
    public void givenDatabaseUpdateDataInTableUsingPreparedStatement() {
        EmployeePayrollService employeePayroll = new EmployeePayrollService();
        try {
            int result = employeePayroll.updateTableBasicPay(2000000, "Nilesh");
            Assert.assertEquals(1, result);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenDatabaseRetrieveDataByNameUsingPreparedStatement() {
        EmployeePayrollService employeePayroll = new EmployeePayrollService();
        try {
            int result = employeePayroll.retrieveByName("Nilesh");
            Assert.assertEquals(2000000, result);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenDatabaseRetrieveDataInRangeOfDate() {
        EmployeePayrollService employeePayroll = new EmployeePayrollService();
        try {
            int result = employeePayroll.dataInRange(Date.valueOf("2019-01-01"), Date.valueOf("2020-11-01"));
            Assert.assertEquals(1, result);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
