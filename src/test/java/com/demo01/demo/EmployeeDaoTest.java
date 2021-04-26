package com.demo01.demo;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class EmployeeDaoTest {

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveAndFind() {
        employeeDao.saveEmployee(new Employee("John Doe"));
        IntStream.range(0,100)
                .forEach(i -> employeeDao.saveEmployee(new Employee("John Doe 0" + i)));

        Employee employee = employeeDao.findEmployeeByName("John Doe");

        assertEquals("John Doe", employee.getName());
    }



}