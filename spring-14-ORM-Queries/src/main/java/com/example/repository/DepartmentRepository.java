package com.example.repository;

import com.example.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

    List<Department> findByDepartment(String department);

    List<Department> findByDivisionIs (String division);

    List<Department> findDistictTop3ByDivisionContains(String division);

}
