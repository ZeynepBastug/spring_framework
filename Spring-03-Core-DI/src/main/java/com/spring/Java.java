package com.spring;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Java {

    // 1. Field Injection

    // @Autowired
    // OfficeHours officeHours;

    // 2. Constructor Injection
      OfficeHours officeHours;
    //  @Autowired
    //  public Java(OfficeHours officeHours) {
    //  this.officeHours = officeHours;
    //  }
    public void getTeachingHours(){
        System.out.println("Weekly teaching hours: " + (20 + officeHours.getHours()));
    }
}
