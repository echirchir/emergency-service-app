package com.robertopere.emergencyservice.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Insurance{

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    @NotNull (message = "Insurance company name field is required")
    private String company_name;
    @NotNull (message = "Type of insurance field is required")
    private String type_of_insurance;
    @NotNull (message = "Insurance number field is required")
    private String insurance_number;

    public Insurance(){

    }

    public Insurance(@NotNull(message = "Insurance company name field is required") String company_name,
            @NotNull(message = "Type of insurance field is required") String type_of_insurance,
            @NotNull(message = "Insurance number field is required") String insurance_number) {
        this.company_name = company_name;
        this.type_of_insurance = type_of_insurance;
        this.insurance_number = insurance_number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getType_of_insurance() {
        return type_of_insurance;
    }

    public void setType_of_insurance(String type_of_insurance) {
        this.type_of_insurance = type_of_insurance;
    }

    public String getInsurance_number() {
        return insurance_number;
    }

    public void setInsurance_number(String insurance_number) {
        this.insurance_number = insurance_number;
    }
    
    
}