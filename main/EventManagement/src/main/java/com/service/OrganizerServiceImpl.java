package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.OrganizerRepo;

import com.model.Organizer;

@Service
public class OrganizerServiceImpl implements OrganizerService{
	
	@Autowired
	OrganizerRepo organizerRepo;

	@Override
	public Organizer addOrganizer(Organizer organizer) {
		// TODO Auto-generated method stub
		return organizerRepo.save(organizer);
	}

	@Override
	public Organizer getOrganizerById(long o_id) {
		
		return organizerRepo.findById(o_id).orElse(null);
	}

	@Override
	public Organizer updateOrganizer(Organizer organizer1) {
		
	        if(organizerRepo.existsById(organizer1.getOid())) {
	            return organizerRepo.save(organizer1);
	        } else {
	            return null;
	        }
		}
		
	

	@Override
	public void deleteOrganizerById(long id) {
		
			
		organizerRepo.deleteById(id);
			System.out.println("Data deleted");
		}
		
	}
	


