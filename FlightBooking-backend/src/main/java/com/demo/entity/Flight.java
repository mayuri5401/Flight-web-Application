package com.demo.entity;


import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Book")
public class Flight {
	@Id
	
	private Long flightID;

	private String fname;
	
	private String source;

	private String dest;
	
	private String depTime;

	private String arrTime;

	private int seats;

	private int cost;
	
	
	
	public Flight(String fname, String source, String dest, String depTime, String arrTime, int seats, int cost) {
		super();
		this.fname = fname;
		this.source = source;
		this.dest = dest;
		this.depTime = depTime;
		this.arrTime = arrTime;
		this.seats = seats;
		this.cost = cost;
	}



	public Flight() {
		// TODO Auto-generated constructor stub
	}



	public Long getFlightID() {
		return flightID;
	}



	public void setFlightID(Long flightID) {
		this.flightID = flightID;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getSource() {
		return source;
	}



	public void setSource(String source) {
		this.source = source;
	}



	public String getDest() {
		return dest;
	}



	public void setDest(String dest) {
		this.dest = dest;
	}



	public String getDepTime() {
		return depTime;
	}



	public void setDepTime(String depTime) {
		this.depTime = depTime;
	}



	public String getArrTime() {
		return arrTime;
	}



	public void setArrTime(String arrTime) {
		this.arrTime = arrTime;
	}



	public int getSeats() {
		return seats;
	}



	public void setSeats(int seats) {
		this.seats = seats;
	}



	public int getCost() {
		return cost;
	}



	public void setCost(int cost) {
		this.cost = cost;
	}

	
}
