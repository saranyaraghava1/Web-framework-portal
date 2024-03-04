package com.example.sample.Day12ce1.controller;



import com.example.sample.Day12ce1.model.Employee;
import com.example.sample.Day12ce1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        // Implement your logic for creating an employee
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/employees-inner-join")
    public ResponseEntity<List<Employee>> getEmployeesInnerJoin() {
        List<Employee> employees = employeeService.getEmployeesInnerJoin();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/employees-left-outer-join")
    public ResponseEntity<List<Employee>> getEmployeesLeftOuterJoin() {
        List<Employee> employees = employeeService.getEmployeesLeftOuterJoin();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
}


