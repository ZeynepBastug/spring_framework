package com.example.repository;


import com.example.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region,Long> {

    // Display all regions in Canada
    List<Region> findByCountry(String country);  // select * from region where country is Canada

    //  Display all Region in Canada, without duplicates
    List<Region> findDistinctByCountry (String country);

    // Display all regions with country name includes 'United'
    List<Region> findByCountryContaining (String Country);

    //Display all regions with country name includes 'United' in order
    List<Region> findByCountryContainingOrderByRegion (String country);

    // Display top 2 regions in Canada
    List <Region> findTop2ByCountry (String country);

}
