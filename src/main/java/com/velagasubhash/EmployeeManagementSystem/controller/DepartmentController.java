package com.velagasubhash.EmployeeManagementSystem.controller;

import com.velagasubhash.EmployeeManagementSystem.model.Department;
import com.velagasubhash.EmployeeManagementSystem.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/department")
@RequiredArgsConstructor
@CrossOrigin("*")
public class DepartmentController {

    private final DepartmentService departmentService;

    @PostMapping("/add")
    public Department createDepartment(@RequestBody Department department){
        return departmentService.createDepartment(department);
    }

    @GetMapping("/getalldepartments")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartment();
    }

    @GetMapping("/department/{Id}")
    public Department getDepartmentById(@PathVariable Long Id){
        return departmentService.getDepartmentById(Id);
    }

    @DeleteMapping("/department/{Id}")
    public String deleteDepartment(@PathVariable Long Id){
        departmentService.deleteDepartment(Id);
        return "Department Deleted Successfully";
    }

    @PutMapping("/department/{Id}")
    public Department UpdateDepartment(@PathVariable Long Id,@RequestBody Department department){
        return departmentService.updateDepartment(Id,department);
    }
}
