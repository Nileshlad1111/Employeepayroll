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
            Assert.assertEquals(5, result);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenDatabaseGroupByGenderReturnSum() {
        EmployeePayrollService employeePayroll = new EmployeePayrollService();

        try {
            int result = employeePayroll.sumGroupBy("M","Gender");
            Assert.assertEquals(16901494, result);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenDatabaseGroupByGenderReturnAverage() {
        EmployeePayrollService employeePayroll = new EmployeePayrollService();

        try {
            int result = employeePayroll.averageGroupBy("M","Gender");
            Assert.assertEquals(3380298, result);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenDatabaseGroupByGenderReturnMin() {
        EmployeePayrollService employeePayroll = new EmployeePayrollService();

        try {
            int result = employeePayroll.minGroupBy("M","Gender");
            Assert.assertEquals(107890, result);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenDatabaseGroupByGenderReturnMax() {
        EmployeePayrollService employeePayroll = new EmployeePayrollService();

        try {
            int result = employeePayroll.maxGroupBy("M","Gender");
            Assert.assertEquals(10789078, result);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenDatabaseGroupByGenderCount() {
        EmployeePayrollService employeePayroll = new EmployeePayrollService();

        try {
            int result = employeePayroll.countGroupBy("M","Gender");
            Assert.assertEquals(5, result);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void addNewEmployeeToNewPayroll() {
        EmployeePayrollService employeePayroll = new EmployeePayrollService();
        try {
            int result = employeePayroll.addNewEmployee(1, "Kiran", 100000.20, Date.valueOf("2020-02-01"), "M", "pune", 589624789);
            Assert.assertEquals(1, result);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
