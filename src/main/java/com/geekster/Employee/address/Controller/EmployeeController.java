package com.geekster.Employee.address.Controller;

import com.geekster.Employee.address.Model.Address;
import com.geekster.Employee.address.Model.Employee;
import com.geekster.Employee.address.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    //GET

    @GetMapping("employees")
    public List<Employee> getAllEmployees()
    {
        return employeeService.getAllEmployess();
    }
    @GetMapping("employee/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }


    //post
    @PostMapping("employee")
    public String addAEmployee(@RequestBody Employee emp)
    {
        return employeeService.addEmployee(emp);
    }

    @PostMapping("employees")
    public String addListOfEmployees(@RequestBody List<Employee>emp){return  employeeService.addListOfEmployees(emp);}

    @DeleteMapping("employee/{id}")
    public String deleteEmployeeById(@PathVariable Long id){
        return employeeService.deleteEmployeeById(id);
    }
}
/*EmployeeController:
GET /employees - get all employees
GET /employees/{id} - get an employee by id
POST /employees - create a new employee
PUT /employees/{id} - update an employee by id
DELETE /employees/{id} - delete an employee by id*/
