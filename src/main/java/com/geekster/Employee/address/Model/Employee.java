package com.geekster.Employee.address.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;
    private String firstName;
    private String lastName;

    @OneToOne
    @JoinColumn(name = "fk_address_id")
    private Address address;

}
