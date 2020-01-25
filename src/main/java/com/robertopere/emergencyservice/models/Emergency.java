package com.robertopere.emergencyservice.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class Emergency{

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull (message = "First name field is required")
    private String first_name;
    @NotNull (message = "Last name field is required")
    private String last_name;
    @NotNull (message = "Patient location field is required")
    private String patient_location;
    @NotNull (message = "Phone number field is required")
    private String phone_number;
    @NotNull (message = "Description field is required")
    private String description;

    public Emergency(){

    }

    public Emergency(String first_name, String last_name, String patient_location, String phone_number, String description) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.patient_location = patient_location;
        this.phone_number = phone_number;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPatient_location() {
        return patient_location;
    }

    public void setPatient_location(String patient_location) {
        this.patient_location = patient_location;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}