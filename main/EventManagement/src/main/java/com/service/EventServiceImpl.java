package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EventRepo;
import com.model.Event;

@Service
public class EventServiceImpl implements EventService {
	@Autowired
	EventRepo eventRepo;

	@Override
	public Event addEvents(Event event) {
		
		return eventRepo.save(event);
	}

	@Override
	public List<Event> getAllEvents() {
		// TODO Auto-generated method stub
		return eventRepo.findAll();
	}

	@Override
	public Event getEventById(long eid) {
		// TODO Auto-generated method stub
		return eventRepo.findById(eid).orElse(null);
	}

	public Event updateEvent(Event event) {
        if(eventRepo.existsById(event.getEid())) {
            return eventRepo.save(event);
        } else {
            return null;
        }
	}

	@Override
	public void deleteEventById(long eid) {

		
		eventRepo.deleteById(eid);
		System.out.println("Data deleted");
	}


	

	@Override

		public List<Event> getEventsByVenue(long v_id) {
	        return eventRepo.findByVenueId(v_id);
		
	}
	public List<Event> getEventsByOrganizerId(Long oid) {
        return eventRepo.findByOrganizerId(oid);
    }
}
