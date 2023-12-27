package com.dm.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dm.demo.entities.Employee;
import com.dm.demo.services.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
        Employee addedEmployee = employeeService.addEmployee(employee);
        return ResponseEntity.ok("Employee added with ID: " + addedEmployee.getId());
    }

    @GetMapping("/all")
    public ResponseEntity<Object> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable String id) {
        employeeService.deleteEmployeeById(id);
        return ResponseEntity.ok("Employee deleted with ID: " + id);
    }

    @PutMapping("/{id}")
    public void updateEmployee(@PathVariable String id, @RequestBody Employee employee) {
        employeeService.updateEmployee(id, employee);
    }

   
}
