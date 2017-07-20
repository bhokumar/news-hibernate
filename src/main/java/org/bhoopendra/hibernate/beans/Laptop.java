package org.bhoopendra.hibernate.beans;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.TableGenerator;

@Entity
@Access(AccessType.FIELD)
//@TableGenerator(name="tableGenerator",initialValue= 1000, allocationSize=100)
public class Laptop {
	@Id
	@Column(name="LAPTOP_ID")
	@GeneratedValue//(strategy=GenerationType.TABLE,generator="tableGenerator")
	private int id;
	private String laptopType;
	private String os;
	@ManyToOne
	private Employee employee;
	public Laptop() {
	}
	
	public Laptop(int id, String laptopType, String os, Employee employee) {
		super();
		this.id = id;
		this.laptopType = laptopType;
		this.os = os;
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLaptopType() {
		return laptopType;
	}
	public void setLaptopType(String laptopType) {
		this.laptopType = laptopType;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employee == null) ? 0 : employee.hashCode());
		result = prime * result + id;
		result = prime * result + ((laptopType == null) ? 0 : laptopType.hashCode());
		result = prime * result + ((os == null) ? 0 : os.hashCode());
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
		Laptop other = (Laptop) obj;
		if (employee == null) {
			if (other.employee != null)
				return false;
		} else if (!employee.equals(other.employee))
			return false;
		if (id != other.id)
			return false;
		if (laptopType == null) {
			if (other.laptopType != null)
				return false;
		} else if (!laptopType.equals(other.laptopType))
			return false;
		if (os == null) {
			if (other.os != null)
				return false;
		} else if (!os.equals(other.os))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", laptopType=" + laptopType + ", os=" + os + ", employee=" + employee + "]";
	}
	
}
