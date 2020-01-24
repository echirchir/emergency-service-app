package com.robertopere.emergencyservice.services;

import com.robertopere.emergencyservice.repository.EmergencyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmergencyService{

    @Autowired
    private EmergencyRepository emergencyRepository;


}