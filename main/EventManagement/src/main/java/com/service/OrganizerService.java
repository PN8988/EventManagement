package com.service;


import com.model.Organizer;

public interface OrganizerService {
	Organizer addOrganizer(Organizer organizer);
	Organizer getOrganizerById(long o_id);
	Organizer updateOrganizer(Organizer organizer1);
	void deleteOrganizerById(long id);
	

}
