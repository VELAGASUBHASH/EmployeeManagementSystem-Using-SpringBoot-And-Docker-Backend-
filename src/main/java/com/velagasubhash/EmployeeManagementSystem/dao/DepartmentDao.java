package com.velagasubhash.EmployeeManagementSystem.dao;

import com.velagasubhash.EmployeeManagementSystem.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentDao extends JpaRepository<Department,Long> {

}
