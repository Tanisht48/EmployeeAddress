package com.geekster.Employee.address.Repository;

import com.geekster.Employee.address.Model.Address;
import org.springframework.data.repository.CrudRepository;

public interface IAddressRepo extends CrudRepository<Address,Long> {
}
