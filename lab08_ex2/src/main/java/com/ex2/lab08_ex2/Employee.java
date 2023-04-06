package com.ex2.lab08_ex2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee 
{
	private Long id;
	private String name;
	private String email;
	private String address;
	private String phone;
	
	protected Employee()
	{
		super();
	}
	
	protected Employee(Long id,String name, String email, String address, String phone)
	{
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public String getName() 
	{
		return this.name;
	}
	
	public String getEmail() 
	{
		return this.email;
	}
	
	public String getAddress() 
	{
		return this.address;
	}
	
	public String getPhone() 
	{
		return this.phone;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}
	
}
