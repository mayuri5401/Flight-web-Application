package com.demo.entity;




import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Book")
public class Customer {
	@Id
	private Long custID;

	private String name;

	private String mobile;

	private String email;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, String mobile, String email) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}
	public Long getCustID() {
		return custID;
	}
	public void setCustID(Long custID) {
		this.custID = custID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
		
	
	
}
