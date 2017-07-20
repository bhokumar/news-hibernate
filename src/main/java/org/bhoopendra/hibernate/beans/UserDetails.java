package org.bhoopendra.hibernate.beans;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {
	@Id
	@GeneratedValue//(strategy = GenerationType.SEQUENCE)
	private int userId;
	
	@Lob
	private String description;
	public UserDetails() {
	}
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private String userName;

	@Temporal(TemporalType.DATE)
	private Date joinedDate;
	
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="street",column=@Column(name="OFFICE_STREET")),
	@AttributeOverride(name="city",column=@Column(name="OFFICE_CITY")),
	@AttributeOverride(name="state",column=@Column(name="OFFICE_STATE")),
	@AttributeOverride(name="pinCode",column=@Column(name="OFFICE_PINCODE")),
	})
	private Address officeAddress;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street",column=@Column(name="HOME_STREET")),
		@AttributeOverride(name="city",column=@Column(name="HOMEE_CITY")),
		@AttributeOverride(name="state",column=@Column(name="HOME_STATE")),
		@AttributeOverride(name="pinCode",column=@Column(name="HOME_PINCODE")),
		})
	private Address homeAddress;

	public UserDetails(String userName, Date joinedDate) {
		super();
		this.userName = userName;
		this.joinedDate = joinedDate;
	}

	
	public UserDetails(String description, String userName, Date joinedDate) {
		super();
		this.description = description;
		this.userName = userName;
		this.joinedDate = joinedDate;
	}
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", description=" + description + ", userName=" + userName
				+ ", joinedDate=" + joinedDate + "]";
	}

}
