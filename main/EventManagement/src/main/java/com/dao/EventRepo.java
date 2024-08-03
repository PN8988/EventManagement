package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.model.Event;

public interface EventRepo extends JpaRepository<Event,Long>{
	 List<Event> findByVenueId(Long v_id);
	 List<Event> findByOrganizerId(Long oid);

}
