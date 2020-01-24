package com.robertopere.emergencyservice.repository;

import com.robertopere.emergencyservice.models.Emergency;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "emergencies", collectionResourceRel = "emergencies")
public interface EmergencyRepository extends PagingAndSortingRepository<Emergency, Long>{


}