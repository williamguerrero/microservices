package com.microservice.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.location.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long>{
}
