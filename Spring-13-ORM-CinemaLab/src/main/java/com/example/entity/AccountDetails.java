package com.example.entity;

import com.example.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class AccountDetails extends BaseEntity{

    private String name;
    private String address;
    private String country;
    private String city;
    private String state;
    private Integer age;
    private String postalCode;
    private Role role;

    @OneToOne (mappedBy = "accountDetails")
    private UserAccount userAccount;
}
