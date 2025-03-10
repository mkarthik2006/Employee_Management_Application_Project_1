package com.ems.employeemanagement.swagger;

import com.ems.employeemanagement.entity.Employee;
import com.ems.employeemanagement.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees") // Different path for API
public class EmployeeRestController {

    @Autowired
    private EmployeeService service;

    // ✅ Get all employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    // ✅ Create a new employee
    @PostMapping
    public Employee createEmployee(@Valid @RequestBody Employee employee) {
        return service.createEmployee(employee);
    }

    // ✅ Get employee by ID
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return service.getEmployeeById(id);
    }

    // ✅ Update employee
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @Valid @RequestBody Employee employee) {
        return service.updateEmployee(id, employee);
    }

    // ✅ Delete employee
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        service.deleteEmployee(id);
    }

    // ✅ Search employee by name
    @GetMapping("/search")
    public List<Employee> searchEmployees(@RequestParam String keyword) {
        return service.searchEmployeesByName(keyword);
    }
}
