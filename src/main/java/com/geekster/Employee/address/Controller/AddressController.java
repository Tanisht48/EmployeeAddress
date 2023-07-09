package com.geekster.Employee.address.Controller;

import com.geekster.Employee.address.Model.Address;
import com.geekster.Employee.address.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    //GET methods
    @GetMapping("addresses")
    public List<Address> getAllAddress()
    {
        return addressService.getAllAddresses();
    }
    @GetMapping("address/{id}")
    public Optional<Address> getAddressById(@PathVariable Long id)
    {
        return  addressService.getAddressById(id);
    }

    @PostMapping("address")
    public String addAddress(@RequestBody Address address)
    {
        return addressService.addAddress(address);
    }
    @PostMapping ("addresses")
    public String addListOfAddresses(@RequestBody List<Address> addressList) {return  addressService.addListOfAddresses(addressList);}
    @DeleteMapping("address/{id}")
    public String deleteAddress(@PathVariable Long id){return addressService.deleteAddress(id);
    }
}
/*AddressController:
GET /addresses - get all addresses
GET /addresses/{id} - get an address by id
POST /addresses - create a new address
PUT /addresses/{id} - update an address by id
DELETE /addresses/{id} - delete an address by id*/