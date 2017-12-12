package org.bhoopendra.hibernate.beans;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="USERS")
public class User implements Serializable {
	private static final long serialVersionUID = 4653874200421257377L;

	@Override
	public String toString() {
		return "User [userName=" + userName + ", address=" + address + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "USER_ID")
	private Long id;

	@Access(AccessType.FIELD)
	private String userName;

	@Transient
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
