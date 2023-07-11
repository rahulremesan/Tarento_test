package com.example.EmpMngmt.service;

import com.example.EmpMngmt.dao.EmployeeDao;
import com.example.EmpMngmt.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeDao.save(employee);
    }

    @Override
    public Optional<Employee> getEmployee(int empId) {
        return employeeDao.findById(empId);
    }

    @Override
    public Optional<Employee> deleteEmployee(int empId){
        employeeDao.deleteById(empId);
        return null;
    }


}
