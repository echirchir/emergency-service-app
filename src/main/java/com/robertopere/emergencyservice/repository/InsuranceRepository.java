package com.robertopere.emergencyservice.repository;


import com.robertopere.emergencyservice.models.Insurance;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "insurances", collectionResourceRel = "insurances")
public interface InsuranceRepository extends PagingAndSortingRepository<Insurance, Long>{


}