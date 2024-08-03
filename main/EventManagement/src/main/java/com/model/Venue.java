package com.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Venue {
	@Id
	long vid;
	String vName;
	String location;
	int capacity;
	
	@OneToMany(mappedBy = "venue")
    private List<Event> events;

	public Venue() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Venue(long vid, String vName, String location, int capacity, List<Event> events) {
		super();
		this.vid = vid;
		this.vName = vName;
		this.location = location;
		this.capacity = capacity;
		this.events = events;
	}

	public long getVid() {
		return vid;
	}

	public void setVid(long vid) {
		this.vid = vid;
	}

	public String getvName() {
		return vName;
	}

	public void setvName(String vName) {
		this.vName = vName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return "Venue [vid=" + vid + ", vName=" + vName + ", location=" + location + ", capacity=" + capacity
				+ ", events=" + events + "]";
	}
	
}
