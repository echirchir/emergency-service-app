package com.robertopere.emergencyservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import com.robertopere.emergencyservice.models.Emergency;
import com.robertopere.emergencyservice.repository.EmergencyRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmergencyServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private EmergencyRepository repository;

	@Test
	public void givenEmergencyExists_whenEmergencyIsFetchedById_thenValidEmergencyIsReceived() throws IOException {

        // Given
		Long id = 1L;
		
        // When
		final Emergency emergency = repository.findById(id).orElse(null);

        // Then
    	assertEquals(emergency.getId(), id);
    }

	@Test
    public void givenEmergencyDoesNotExist_whenEmergencyIsRetrieved_thenEmergencyIsNull() throws IOException {

        // Given
		Long id = 4L;
		
        // When
		final Emergency emergency = repository.findById(id).orElse(null);

        // Then
        assertEquals(emergency, null);
        
	}
	
	@Test
    public void givenAtLeastOneEmergency_whenEmergenciesAreFetched_thenSizeOfEmergenciesIsGreaterThanZero() throws IOException {

        // Given
		int sizeOfEmergencies = 0;
		
        // When
		final List<Emergency> emergencies = (List<Emergency>) repository.findAll();

        // Then
        assertTrue(emergencies.size() > sizeOfEmergencies);
        
	}

    @Test
    public void givenAddNewEmergency_whenPostRequestIsExecuted_thenTheNewSizeOfEmergenciesGreaterByOne() throws IOException {
		
		// Given
		List<Emergency> currentEmergencies = (List<Emergency>)repository.findAll();
		int currentNumberOfEmergencies = currentEmergencies.size();


		Emergency emergency = new Emergency();
		emergency.setFirst_name("Branson");
		emergency.setLast_name("Gitomeh");
		emergency.setPatient_location("Thika");
		emergency.setPhone_number("071269734");
		emergency.setDescription("Injury from bike accident along Thika road");
		
        // When
		repository.save(emergency);

		List<Emergency> updatedEmergencies = (List<Emergency>)repository.findAll();

		int newNumberOfEmergencies = updatedEmergencies.size();

        // Then
        assertTrue(currentNumberOfEmergencies < newNumberOfEmergencies);
        
    }


}
