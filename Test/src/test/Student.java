package test;

import java.util.ArrayList;

public class Student
{
	private String name;
	private static ArrayList<Student> studentList = new ArrayList<>();
	
	
	public Student(String name)
	{
		this.name = name;
		studentList.add(this);
	}
	
	public ArrayList<Student> getALl()
	{
		return studentList;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

}

class Test
{
	public static void main(String[] args)
	{
		Student student = new Student("Nitish");
		Student student2 = new Student("Yojana");
		Student std3 = new Student("Suresh");
		
		for(Student std : student.getALl())
		{
			System.out.println(std);
		}
	}	

}