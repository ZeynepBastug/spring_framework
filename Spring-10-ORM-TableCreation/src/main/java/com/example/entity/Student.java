package com.example.entity;

import com.example.enums.Gender;

import javax.persistence.*;

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "studentFirstName")
    private String firstName;
    @Column(name = "studentLastName")
    private String lastName;
    private String email;

    @Transient // -> makes this variable into table as column
    private String city;

    @Column(columnDefinition = "DATE")
    private String birthDate;
    @Column(columnDefinition = "TIME")
    private String birthTime;
    @Column(columnDefinition = "TIMESTAMP")
    private String birthDateTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;
}
