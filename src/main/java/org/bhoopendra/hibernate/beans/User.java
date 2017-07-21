package org.bhoopendra.hibernate.beans;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="USER")
//@SequenceGenerator(name="seq",initialValue=1000,allocationSize=50)
public class User implements Serializable {
	private static final long serialVersionUID = 4653874200421257377L;

	@Override
	public String toString() {
		return "User [userName=" + userName + ", address=" + address + "]";
	}

	@Id
	@GeneratedValue//(strategy=GenerationType.SEQUENCE,generator= "seq")
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
