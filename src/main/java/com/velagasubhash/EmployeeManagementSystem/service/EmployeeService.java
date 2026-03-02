package com.velagasubhash.EmployeeManagementSystem.service;

import com.velagasubhash.EmployeeManagementSystem.dao.EmployeeDoa;
import com.velagasubhash.EmployeeManagementSystem.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeDoa employeeDoa;

    public Employee createEmployee(Employee employee){
        return employeeDoa.save(employee);
    }

    public List<Employee> getAllEmployees(){
        return employeeDoa.findAll();
    }

    public Employee getEmployeeById(Long Id){
        return employeeDoa.findById(Id)
                .orElseThrow(()->new RuntimeException("Unable To Find Employee"));
    }

    public Employee deleteEmployee(Long Id){
         employeeDoa.deleteById(Id);
        return null;
    }

    public Employee updateEmployee(long Id,Employee employee){
        Employee existingEmployee = employeeDoa.findById(Id)
                .orElseThrow(()->new RuntimeException("Employee Not Found"));
        existingEmployee.setName(employee.getName());
        existingEmployee.setName(employee.getEmail());
        existingEmployee.setSalary(employee.getSalary());
        existingEmployee.setDepartment(employee.getDepartment());

        return employeeDoa.save(existingEmployee);
    }
}
