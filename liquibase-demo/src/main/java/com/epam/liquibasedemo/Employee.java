package com.epam.liquibasedemo;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "com.epam.liquibasedemo.CustomUUID")
	@Column(name = "id")
	private UUID id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "address")
	private String address;

	public Employee() {
		
	}

	


	public Employee(UUID id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}











	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
