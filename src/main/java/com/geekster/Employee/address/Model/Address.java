package com.geekster.Employee.address.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Address {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long addressId;

  private String addressStreet;
  private String addressCity;
  private String addressState;
  private String addressZip;


}

/*Employee:
id (Long)
first name (String)
lastName (String)
address (Address)
Address:
id (Long)
street (String)
City (String)
state (String)
Zipcode (String)
In the Employee entity class, add a @OneToOne annotation to the address attribute,
to create a one-to-one mapping between Employee and Address:
*/