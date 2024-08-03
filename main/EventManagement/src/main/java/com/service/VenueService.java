package com.service;

import com.model.Venue;

public interface VenueService  {
	Venue addVenues(Venue venue);
	Venue getvenueById(long v_id);
	Venue updateVenues(Venue v1);
Void deletevenues(long id);
}
