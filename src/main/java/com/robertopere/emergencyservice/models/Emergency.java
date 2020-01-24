package com.robertopere.emergencyservice.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Entity
@Getter
@EqualsAndHashCode
public class Emergency{

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull (message = "First name is required")
    private String first_name;

    @NotNull (message = "Last name is required")
    private String last_name;

    @NotNull (message = "Patient location is required")
    private String patient_location;

    @NotNull (message = "Phone number is required")
    private String phone_number;
    
    @NotNull (message = "Description of emergency is required")
    private String description;

    public Emergency(){

    }

    public Emergency(@NotNull String first_name, @NotNull String last_name, @NotNull String patient_location,
            @NotNull String phone_number, @NotNull String description) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.patient_location = patient_location;
        this.phone_number = phone_number;
        this.description = description;
    }

}