package com.geekster.Employee.address.Service;

import com.geekster.Employee.address.Model.Address;
import com.geekster.Employee.address.Repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;
    public String addAddress(Address address) {
        iAddressRepo.save(address);

        return "Address added";
    }

    public List<Address> getAllAddresses() {
        return (List<Address>) iAddressRepo.findAll();
    }

    public Optional<Address> getAddressById(Long id) {
       return iAddressRepo.findById(id);
    }

    public String deleteAddress(Long id) {
        iAddressRepo.deleteById(id);
        return "Address Removed";
    }

    public String addListOfAddresses(List<Address> addressList) {
        iAddressRepo.saveAll(addressList);


        return "Addresses added";
    }
}
