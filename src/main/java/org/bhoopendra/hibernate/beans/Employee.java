package org.bhoopendra.hibernate.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "EMPLOYEE_TABLE")
public class Employee {
	
	@Column(name="EMPLOYEE_NAME")
	private String name;
	@Id
	@Column(name="EMPLOYEE_ID")
	@GeneratedValue//(strategy=GenerationType.AUTO) //Its a default strategy.
	private int employeeId;
	@Embedded
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	@OneToMany(mappedBy ="employee")
	private List<Laptop> laptops;

	@Transient
	private String emp_test;

	public Employee() {
	}
	
	
	public Employee(String name, int employeeId, Address address, List<Laptop> laptops) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.address = address;
		this.laptops = laptops;
	}

	public Employee(String name, int employeeId, Address address) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((emp_test == null) ? 0 : emp_test.hashCode());
		result = prime * result + employeeId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Employee other = (Employee) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (emp_test == null) {
			if (other.emp_test != null)
				return false;
		} else if (!emp_test.equals(other.emp_test))
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", address=" + address + ", emp_test="
				+ emp_test + "]";
	}

}
