package com.demo.entity;

import java.util.Date;


import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Book")
public class Booking {
	@Id
	
	private Long bID;

	private Long custId;

	private Long flightID;

	private Date bdate;
	
	public Booking(Long custId, Long flightID, Date bdate) {
		super();
		this.custId = custId;
		this.flightID = flightID;
		this.bdate = bdate;
	}

	public Booking() {
		// TODO Auto-generated constructor stub
	}

	public Long getbID() {
		return bID;
	}

	public void setbID(Long bID) {
		this.bID = bID;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public Long getFlightID() {
		return flightID;
	}

	public void setFlightID(Long flightID) {
		this.flightID = flightID;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	
	

}
