package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Venue;

public interface VenueRepo extends JpaRepository<Venue, Long> {

}
