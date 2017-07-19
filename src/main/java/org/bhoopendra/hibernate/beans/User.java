package org.bhoopendra.hibernate.beans;

import java.io.Serializable;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4653874200421257377L;
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", address=" + address + "]";
	}
	private String userName;
	private Address address;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
