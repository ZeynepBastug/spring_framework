package com.example.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "customers")
public class Customer extends BaseEntity{

    private String userName;
    private String name;
    private String surname;
    private String email;
    private String address;

    @OneToMany(mappedBy = "customer")
    private List<Payment> payment;

    public Customer(String userName, String name, String surname, String email, String address) {
        this.userName = userName;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
    }
}
