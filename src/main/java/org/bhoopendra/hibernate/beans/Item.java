package org.bhoopendra.hibernate.beans;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public class Item {
	private String name;
	private String description;
	private BigDecimal initialPrice;
	private BigDecimal reservePrice;
	private Date startDate;
	private Date endDate;
	private Date createdDate;
	private Set<Category> categories;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getInitialPrice() {
		return initialPrice;
	}
	public void setInitialPrice(BigDecimal initialPrice) {
		this.initialPrice = initialPrice;
	}
	public BigDecimal getReservePrice() {
		return reservePrice;
	}
	public void setReservePrice(BigDecimal reservePrice) {
		this.reservePrice = reservePrice;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Set<Category> getCategories() {
		return categories;
	}
	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	
	public Item() {
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categories == null) ? 0 : categories.hashCode());
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((initialPrice == null) ? 0 : initialPrice.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((reservePrice == null) ? 0 : reservePrice.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (categories == null) {
			if (other.categories != null)
				return false;
		} else if (!categories.equals(other.categories))
			return false;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (initialPrice == null) {
			if (other.initialPrice != null)
				return false;
		} else if (!initialPrice.equals(other.initialPrice))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (reservePrice == null) {
			if (other.reservePrice != null)
				return false;
		} else if (!reservePrice.equals(other.reservePrice))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}
	public Item(String name, String description, BigDecimal initialPrice, BigDecimal reservePrice, Date startDate,
			Date endDate, Date createdDate, Set<Category> categories) {
		super();
		this.name = name;
		this.description = description;
		this.initialPrice = initialPrice;
		this.reservePrice = reservePrice;
		this.startDate = startDate;
		this.endDate = endDate;
		this.createdDate = createdDate;
		this.categories = categories;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", description=" + description + ", initialPrice=" + initialPrice
				+ ", reservePrice=" + reservePrice + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", createdDate=" + createdDate + ", categories=" + categories + "]";
	}
	
}
