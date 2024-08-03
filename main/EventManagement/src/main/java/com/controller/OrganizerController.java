package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.model.Organizer;

import com.service.OrganizerService;

@RestController
public class OrganizerController {
	
	@Autowired
	OrganizerService organizerService;
	
	@PostMapping("/addorganizer")
	public Organizer addOrganizer(@RequestBody Organizer organizer) {
		return organizerService.addOrganizer(organizer);
	}
	
	@GetMapping("/organizer/{oid}")
    public Organizer getOrganizerById(@PathVariable long o_id) {
        return organizerService.getOrganizerById(o_id);
    }
//	
	@DeleteMapping("/deleteorganizer/{id}")
    public void deleteOrganizerById(@PathVariable long id) {
		organizerService.deleteOrganizerById(id);
    }
}
