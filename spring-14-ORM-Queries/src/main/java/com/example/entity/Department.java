package com.example.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table( name = "departments")
@NoArgsConstructor
@Data
public class Department {
    @Id
    private String department;
    private String division;

}