package com.microservice.basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.basic.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long>{
}
