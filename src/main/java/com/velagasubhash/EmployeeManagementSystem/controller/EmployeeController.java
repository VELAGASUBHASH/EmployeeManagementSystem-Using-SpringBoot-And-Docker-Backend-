package com.velagasubhash.EmployeeManagementSystem.controller;



import com.velagasubhash.EmployeeManagementSystem.model.Employee;
import com.velagasubhash.EmployeeManagementSystem.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
@CrossOrigin("*")


public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping("/add")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/allemployees")
    public List<Employee> getAllEmployee(){
        return  employeeService.getAllEmployees();
    }

    @GetMapping("/employee/{Id}")
    public Employee getEmployeeById(@PathVariable Long Id){
        return employeeService.getEmployeeById(Id);
    }

    @PutMapping("/employee/{Id}")
    public Employee updateEmployee(@PathVariable Long Id,@RequestBody Employee employee){
        return employeeService.updateEmployee(Id,employee);
    }

    @DeleteMapping("/employee/{Id}")
    public Employee deleteEmployee(@PathVariable Long Id){
        return employeeService.deleteEmployee(Id);
    }



}
