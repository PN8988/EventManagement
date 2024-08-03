package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.model.Venue;
import com.service.VenueService;

@RestController
public class VenueController {
	@Autowired 
	VenueService venueService;
	
	@PostMapping("/addvenues")
	public Venue addVenues(@RequestBody Venue venue) {
		return venueService.addVenues(venue);
	}
	
	@GetMapping("getvenue/{id}")
	public Venue getvenueById(@PathVariable long v_id) {
		return venueService.getvenueById( v_id);
		
	}
	@PutMapping("/updateVenue")
    public Venue updateVenues(@RequestBody Venue v1) {
        return venueService.updateVenues(v1);
    }
	@DeleteMapping("/deletevenue/{id}")
    public void deletevenues(@PathVariable long id) {
		venueService.deletevenues(id);
    }
}
