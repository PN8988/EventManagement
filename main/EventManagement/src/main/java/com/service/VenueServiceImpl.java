package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.VenueRepo;

import com.model.Venue;

@Service
public class VenueServiceImpl implements VenueService{
	
	@Autowired
	VenueRepo venueRepo;

	@Override
	public Venue addVenues(Venue venue) {
		// TODO Auto-generated method stub
		return venueRepo.save(venue);
	}

	@Override
	public Venue getvenueById(long v_id) {
		// TODO Auto-generated method stub
		return venueRepo.findById(v_id).orElse(null);
	}

	@Override
	public Venue updateVenues(Venue v1) {
        if(venueRepo.existsById(v1.getVid())) {
            return venueRepo.save(v1);
        } else {
            return null;
        }
	}

	@Override
	public Void deletevenues(long id) {
		// TODO Auto-generated method stub
		venueRepo.deleteById(id);
		return null;
	}

	
	

}
