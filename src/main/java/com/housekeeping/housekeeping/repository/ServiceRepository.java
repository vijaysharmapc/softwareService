package com.housekeeping.housekeeping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.housekeeping.housekeeping.model.Services;

public interface ServiceRepository extends JpaRepository<Services,Integer> {

}
