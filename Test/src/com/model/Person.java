package com.model;

public class Person
{
	private String name;
	private String address;
	private String phone;
	
	
	public Person(String name, String address,String phone)
	{
		this.name=name;
		this.address = address;
		this.phone = phone;
	}
	
	public Person()
	{
		
	}

	public void showInfo()
	{
		System.out.println("Person [name=" + name + ", address=" + address + ", phone=" + phone + "]");
	}

	
}
