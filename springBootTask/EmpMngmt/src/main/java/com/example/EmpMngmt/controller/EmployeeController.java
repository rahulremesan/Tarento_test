package com.example.EmpMngmt.controller;

import com.example.EmpMngmt.dto.Employee;
import com.example.EmpMngmt.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){

        return employeeService.addEmployee(employee);
    }

    @GetMapping("/getEmployee/{empId}")
    public Employee getEmployee(@PathVariable int empId){

        return employeeService.getEmployee(empId).get();
    }

    @DeleteMapping("/deleteEmployee/{empId}")
    public void deleteEmployee(@PathVariable int empId){

        employeeService.deleteEmployee(empId);
    }

}
