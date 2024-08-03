package com.service;

import java.util.List;

import com.model.Event;

public interface EventService {
	Event addEvents(Event event);
	List<Event> getAllEvents();
	 Event getEventById(long eid);
	 Event updateEvent(Event event);
	 void deleteEventById(long eid);
	 List<Event> getEventsByVenue(long v_id);
	 List<Event> getEventsByOrganizerId(Long oid);
}
