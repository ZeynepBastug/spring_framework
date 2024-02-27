package com.example.repository;

import com.example.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.beans.Transient;
import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    //Display all employees with email address
    List<Employee> findByEmail (String email);

    // Display all employees with first name ' ' and last name ' ', also show all employees with an email address
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstname, String lastname, String email);

    // Display all employees that first name is not ' '
    List<Employee> findByFirstNameIsNot (String firstname);

    // Display all employees where last name starts with ' '
    List<Employee> findByFirstNameStartsWith (String pattern);

    // Display all employees with salary is higher than ' '
    List<Employee> findBySalaryGreaterThan (Integer salary);

    // Display all employees with salary less than ' '
    List<Employee> findBySalaryLessThan (Integer salary);

    // Display all employees that has been hired between ' ' and ' '
    List<Employee> findByHireDateBetween (LocalDate startDate, LocalDate endDate);

    // Display all employees where salary greater or equal to ' ' in order
    List<Employee> findBySalaryGreaterThanEqualOrderBySalary(Integer salary);

    // Display top unique 3 employees that is making less than ' '
    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

    // Display all employees that do not have email address
    List<Employee> findByEmailIsNull();

    @Query (" SELECT e FROM Employee e WHERE e.email = 'sdubber7@t-online.de'")
    List<Employee> getEmployeeDetail();

    @Query ("SELECT e.salary FROM Employee e WHERE e.email = 'sdubber7@t-online.de' ")
    List<Employee> getEmployeSalary();

    @Query ("SELECT e FROM Employee e WHERE e.email = ?1")
    List<Employee> getEmployeeDetail(String email);

    @Query ("SELECT e FROM Employee e WHERE e.email=?1 AND e.salary=?2")
    List<Employee> getEmployeeDetail(String email, Integer salary);

    // Not Equal
    @Query("SELECT e FROM Employee e WHERE e.salary <> ?1 ")
    List<Employee> getEmployeeSalaryNotEqual(int salary);

    // like/contains/startswith/endswith
    @Query("SELECT e FROM Employee e WHERE e.firstName LIKE ?1")
    List<Employee> getEmployeeFirstNameLike(String pattern);

    //less than
    @Query("SELECT e FROM Employee e WHERE e.salary < ?1 ")
    List<Employee> getEmployeeSalaryLessThan (int salary);

    // greater than
    @Query("SELECT e FROM Employee e WHERE e.salary > ?1 ")
    List<Employee> getEmployeeSalaryGreaterThan(int salary);

    // Before
    @Query ("SELECT e FROM Employee e WHERE e.hireDate> ?1")
    List<Employee> getEmployeeHireDateBefore(LocalDate date);

    // Between
    @Query ("SELECT e FROM Employee e WHERE e.salary BETWEEN ?1 AND ?2")
    List<Employee> getEmployeeSalaryBetween (int salary1, int salary2);

    // Null
    @Query ("SELECT e FROM Employee e WHERE e.email IS NULL")
    List<Employee> getEmployeeEmailIsNull(String email);

    // NOT Null
    @Query ("SELECT e FROM Employee e WHERE e.email IS NOT NULL")
    List<Employee> getEmployeeEmailIsNOTNull(String email);

    //Sorting in ascending order
    @Query ("SELECT e FROM Employee e ORDER BY e.salary ")
    List<Employee> getEmployeeSalaryOrderAsc();

    //Sorting in Descending order
    @Query ("SELECT e FROM Employee e ORDER BY e.salary DESC")
    List<Employee> getEmployeeSalaryOrderDesc();

    @Modifying
    @Transactional
    @Query("UPDATE Employee e SET e.email = 'admin@email.com' WHERE e.id = :id")
    void updateEmployeeJPQL(@Param("id") Long id);





}
