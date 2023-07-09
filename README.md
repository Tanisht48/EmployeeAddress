# EmployeeAddress
___

___
## FrameWork and Language
    Framework:SpringBoot
    Language : Java
## Dependencies
    SpringBoot Starter Web
    Lombok
    Validation
    MySql
    JPA
    Swagger Ui

## Data Flow
  ### Schemas
     Address
       1.addressId	integer($int64)
       2.addressStreet	string
       3.addressCity	string
       4.addressState	string
       5.addressZip	string
  ___
    Employee
      1.id	integer($int64)
      2.firstName	string
      3.lastName	string
      4.address	Address{...}


  ### Controller
     employee-controller
       1.GET/employees
       2.POST/employees
       3.POST/employee
       4.GET/employee/{id}
       5.DELETE/employee/{id}
     ___
     address-controller
     1.GET/addresses
     2.POST/addresses
     3.POST/address
     GET/address/{id}
     DELETE/address/{id}

## Project Summary
  In this application we can Create Read Update Delete a Employees from the different api that are in this application. 
  There are Mappings used in this application like **onetoone** for placing mapping two entites  Employee and there addresses
