package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Event;
import com.service.EventService;

@RestController
public class EventController {
	@Autowired
	private EventService eventService;
	
	@PostMapping("/addevent")
	public Event addEvents(@RequestBody Event event) {
		return eventService.addEvents(event);
		
	}
	@GetMapping("/events") // Add this method
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }
	@GetMapping("/events/{eid}")
    public Event getEventById(@PathVariable long eid) {
        return eventService.getEventById(eid);
    }
	 @PutMapping("/updateevent")
	    public Event updateEvent(@RequestBody Event event) {
	        return eventService.updateEvent(event);
	    }
	 @DeleteMapping("/deleteevent/{id}")
	    public void deleteEventById(@PathVariable long id) {
	        eventService.deleteEventById(id);
	    }
	 @GetMapping("/venue/{venueId}")
	    public ResponseEntity<List<Event>> getEventsByVenueId(@PathVariable Long v_id) {
	        List<Event> events = eventService.getEventsByVenue(v_id);
	        if (events.isEmpty()) {
	            return ResponseEntity.noContent().build();
	        }
	        return ResponseEntity.ok(events);
	    }
	 @GetMapping("/organizer/{organizerId}")
	    public ResponseEntity<List<Event>> getEventsByOrganizerId(@PathVariable Long oid) {
	        List<Event> events = eventService.getEventsByOrganizerId(oid);
	        if (events.isEmpty()) {
	            return ResponseEntity.noContent().build();
	        }
	        return ResponseEntity.ok(events);
	    }
}
