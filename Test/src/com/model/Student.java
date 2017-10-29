package com.model;

public class Student extends Person
{
	private String email;
	private String standard;
	
	
	public Student(String name,String address, String phone, String email, String standard)
	{
		super(name, address,phone);
		this.email = email;
		this.standard = standard;
	}

}
