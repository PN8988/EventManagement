package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Event {
	@Id
	long eid;
	String eName;
	String eDate;
	String description;
	
	@ManyToOne
    @JoinColumn(name = "oid")
    private Organizer organizer;

    @ManyToOne
    @JoinColumn(name = "v_id")
    private Venue venue;
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Event(long eid, String eName, String eDate, String description, Organizer organizer, Venue venue) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.eDate = eDate;
		this.description = description;
		this.organizer = organizer;
		this.venue = venue;
	}
	public long getEid() {
		return eid;
	}
	public void setEid(long eid) {
		this.eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteDate() {
		return eDate;
	}
	public void seteDate(String eDate) {
		this.eDate = eDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Organizer getOrganizer() {
		return organizer;
	}
	public void setOrganizer(Organizer organizer) {
		this.organizer = organizer;
	}
	public Venue getVenue() {
		return venue;
	}
	public void setVenue(Venue venue) {
		this.venue = venue;
	}
	@Override
	public String toString() {
		return "Event [eid=" + eid + ", eName=" + eName + ", eDate=" + eDate + ", description=" + description
				+ ", organizer=" + organizer + ", venue=" + venue + "]";
	}
	
}
