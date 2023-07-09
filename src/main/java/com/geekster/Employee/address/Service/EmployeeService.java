package com.geekster.Employee.address.Service;

import com.geekster.Employee.address.Model.Address;
import com.geekster.Employee.address.Model.Employee;
import com.geekster.Employee.address.Repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    IEmployeeRepo iEmployeeRepo;

    public List<Employee> getAllEmployess() {
        return (List<Employee>) iEmployeeRepo.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return iEmployeeRepo.findById(id).orElseThrow(() -> new IllegalStateException("id not found"));
    }

    public String addEmployee(Employee emp) {
        iEmployeeRepo.save(emp);
        return"Employee added!!!";
    }

    public String addEmployees(List<Employee> emp) {
        iEmployeeRepo.saveAll(emp);
        return "Employees ADDED !!!";
    }



    public String updateEmployeeAddress(Employee emp) {
        iEmployeeRepo.save(emp);

        return "Address updated";
    }

    public String addListOfEmployees(List<Employee> employeeList) {
        iEmployeeRepo.saveAll(employeeList);


        return "Addresses added";
    }

    public String deleteEmployeeById(Long id) {
       iEmployeeRepo.deleteById(id);

       return "Employee Removed";
    }
}
