package com.example.demoapp.employees;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EmployeeControllerTest {

    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    void listEmployee() {
        // Act
        EmployeeService[] results = testRestTemplate.getForObject("/employees", EmployeeService[].class);
        // Assert
        assertEquals(2, results.length);
        assertEquals(1, results[0].getId());
        assertEquals("Nattawat", results[0].getName());
    }

    @Test
    void getEmployeeById() {
        int id = 1;
        // Act
        EmployeeService result = testRestTemplate.getForObject("/employees/" + id, EmployeeService.class);
        // Assert
        assertEquals(id, result.getId());
        assertEquals("Nattawat", result.getName());
    }

}