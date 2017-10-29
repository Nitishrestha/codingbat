package net.nitish;

public class Student extends Person
{
	private String email;
	private String college;
	private String faculty;
	
	public Student()
	{
		
	}
	
	
	
	@Override
	public String toString() {
		return "Student [email=" + email + ", college=" + college + ", faculty=" + faculty + "]";
	}



	public Student(String email, String college, String faculty, String name, String address, int age)
	{
		super(age,name,address);
		this.email = email;
		this.college = college;
		this.faculty = faculty;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	public void read()
	{
		System.out.println("Student is reading...");
	}
	public void doHomework()
	{
		System.out.println("Student is doing homework...");
	}
	public void drawFigures()
	{
		System.out.println("Student is drawing figures...");
	}
}
