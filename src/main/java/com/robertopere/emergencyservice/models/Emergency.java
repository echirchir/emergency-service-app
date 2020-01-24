package com.robertopere.emergencyservice.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Emergency{

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    
}