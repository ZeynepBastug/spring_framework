package com.example.bootstrap;

import com.example.repository.CourseRepository;
import com.example.repository.DepartmentRepository;
import com.example.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator  implements CommandLineRunner {

    RegionRepository regionRepository;
    DepartmentRepository departmentRepository;
    CourseRepository courseRepository;

    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository, CourseRepository courseRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("----------- REGION START -----------");

        System.out.println("findByCountry = " + regionRepository.findByCountry("Canada"));
        System.out.println("findDistinctByCountry = " + regionRepository.findDistinctByCountry("Canada"));
        System.out.println("findByCountryContaining = " + regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountryContainingOrderByRegion = " + regionRepository.findByCountryContainingOrderByRegion("United"));
        System.out.println("findTop2ByCountry= " + regionRepository.findTop2ByCountry("Canada"));

        System.out.println("------------ REGION END ------------");

        System.out.println("--------- DEPARTMENT START ---------");

        System.out.println("departmentRepository.findByDepartment(Toys) = " + departmentRepository.findByDepartment("Toys"));
        System.out.println("departmentRepository.findByDivisionIs(Outdoors) = " + departmentRepository.findByDivisionIs("Outdoors"));
        System.out.println("departmentRepository.findDistictTop3ByDivisionContains() = " + departmentRepository.findDistictTop3ByDivisionContains(""));


        System.out.println("---------- DEPARTMENT END ----------");


    }
}
