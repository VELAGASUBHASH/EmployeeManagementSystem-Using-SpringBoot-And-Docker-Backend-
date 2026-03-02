package com.velagasubhash.EmployeeManagementSystem.dao;

import com.velagasubhash.EmployeeManagementSystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeDoa extends JpaRepository<Employee,Long> {
    List<Employee> findByDepartmentId(Long departmentId);
}
