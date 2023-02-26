package com.axis.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="stakeHolders")
public class StakeHolder {
	@Id
	private String id;
	private String name;
	private int no_of_shares;
	private String address;
	private String email;
	private String imageUrl;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo_of_shares() {
		return no_of_shares;
	}
	public void setNo_of_shares(int no_of_shares) {
		this.no_of_shares = no_of_shares;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public StakeHolder(String id, String name, int no_of_shares, String address, String email, String imageUrl) {
		super();
		this.id = id;
		this.name = name;
		this.no_of_shares = no_of_shares;
		this.address = address;
		this.email = email;
		this.imageUrl=imageUrl;
	}
	public StakeHolder() {
		super();
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	


}
