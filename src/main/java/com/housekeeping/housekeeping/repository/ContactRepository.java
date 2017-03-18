package com.housekeeping.housekeeping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.housekeeping.housekeeping.model.Contact;

public interface ContactRepository extends JpaRepository<Contact,Long> {

}
