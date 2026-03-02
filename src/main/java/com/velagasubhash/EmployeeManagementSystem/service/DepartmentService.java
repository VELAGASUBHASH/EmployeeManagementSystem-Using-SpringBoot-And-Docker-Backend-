package com.velagasubhash.EmployeeManagementSystem.service;

import com.velagasubhash.EmployeeManagementSystem.dao.DepartmentDao;
import com.velagasubhash.EmployeeManagementSystem.model.Department;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentService {
    private final DepartmentDao departmentDao;

    public Department createDepartment(Department department){
        return departmentDao.save(department);
    }

    public List<Department> getAllDepartment(){
        return departmentDao.findAll();
    }

    public Department getDepartmentById(Long Id){
        return departmentDao.findById(Id)
                .orElseThrow(()-> new RuntimeException("Unable Find By Department"));
    }

    public void deleteDepartment(Long Id){
       Department department = departmentDao.findById(Id)
               .orElseThrow(()-> new RuntimeException("Unable Find Department"));

       departmentDao.delete(department);

    }

    public Department updateDepartment(@PathVariable Long Id, @RequestBody Department department){
            Department updateDepartment = departmentDao.findById(Id)
                    .orElseThrow(()->new RuntimeException("Unable Find Department"));

            updateDepartment.setName(department.getName());
            updateDepartment.setLocation(department.getLocation());

            return departmentDao.save(updateDepartment);


    }



}
