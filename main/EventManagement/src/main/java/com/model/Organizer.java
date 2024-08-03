package com.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Organizer {
	@Id
	long oid;
	String oName;
	String contactInfo;
	
	   @OneToMany(mappedBy = "organizer")
	    private List<Event> events;

	public Organizer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Organizer(long oid, String oName, String contactInfo, List<Event> events) {
		super();
		this.oid = oid;
		this.oName = oName;
		this.contactInfo = contactInfo;
		this.events = events;
	}

	public long getOid() {
		return oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public String getoName() {
		return oName;
	}

	public void setoName(String oName) {
		this.oName = oName;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return "Organizer [oid=" + oid + ", oName=" + oName + ", contactInfo=" + contactInfo + ", events=" + events
				+ "]";
	}
	
	   
	

}
