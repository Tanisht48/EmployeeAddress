package com.geekster.Employee.address.Repository;


import com.geekster.Employee.address.Model.Employee;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;


import java.util.Optional;

public interface IEmployeeRepo extends JpaRepositoryImplementation<Employee,Long> {
//@Modifying(clearAutomatically=true)
//@Transactional
//    @Query(value = "Select e.address from employee e where e.id= :employeeId",nativeQuery = true)
//    Optional<Address> findByAddressWhereId(Long employeeId);
}
