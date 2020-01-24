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

    @NotNull
    private String first_name;
    @NotNull
    private String last_name;
    @NotNull
    private String patient_location;
    @NotNull
    private String phone_number;
    @NotNull
    private String description;
    
}