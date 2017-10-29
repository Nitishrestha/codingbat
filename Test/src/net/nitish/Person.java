package net.nitish;

public class Person {
	private String name;
	private String address;
	private int age;

	public Person() {
		System.out.println("default constructor is called...");
	}

	public Person(int age, String name, String address) {
		System.out.println("parameterized constructor is called...");
		this.age = age;
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void walk() {
		System.out.println("Person is walking...");
	}

	public void eat() {
		System.out.println("Person is eating...");
	}

	public void sleep() {
		System.out.println("Person is sleeping...");
	}

}
