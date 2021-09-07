package com.example.demoapp.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable String id) {
//       Validate input
//       Claening data
        Employee response
                = employeeService.getById(Integer.parseInt(id));
        return response;
    }

    @GetMapping("/employees")
    public Employee[] listEmployee() {
        Employee employee01 = new Employee();
        employee01.setId(1);
        employee01.setName("atiruj");
        Employee employee02 = new Employee();
        employee02.setId(2);
        employee02.setName("atiruj 2");
        return new Employee[]{employee01, employee02};
    }
}