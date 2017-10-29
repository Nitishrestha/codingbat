package west;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrayer {
	public static void main(String[] args) {

		Student nitish = new Student("Nitish");
		Student prajil = new Student("Prajil");
		Student sandeep = new Student("Sandeep");

		Subject physics = new Subject("Physics");
		Subject chemistry = new Subject("Chemistry");
		Subject biology = new Subject("Biology");

		int subMarks[][] = new int[Student.getStudents().size()][Subject.getSubjects().size()];
		Scanner scanner = new Scanner(System.in);

		for (int student = 0; student < Student.getStudents().size(); student++) {
			for (int subject = 0; subject < Subject.getSubjects().size(); subject++) {
				System.out.println("Enter marks obtained by " + Student.getStudents().get(student).getName() + " in "
						+ Subject.getSubjects().get(subject).getName() + ":");

				subMarks[student][subject] = scanner.nextInt();
			}
		}
		System.out.println("================================================================");

		for (int student = 0; student < Student.getStudents().size(); student++) {
			for (int subject = 0; subject < Subject.getSubjects().size(); subject++) {
				System.out.print(subMarks[student][subject] + "\t");
			}
			System.out.println();
		}

		System.out.println("========================================");

		int total = 0;

		for(int student = 0; student < Student.getStudents().size(); student++)
		{
		for (int subject = 0; subject < Subject.getSubjects().size(); subject++)
		{
			total += subMarks[student][subject];
		}
		System.out.println("Total Marks of "+Student.getStudents().get(student).getName()+" is "+total);
	}
	}
}

class Student {
	private String name;

	private static ArrayList<Student> studentList = new ArrayList<>();

	public Student(String name) {
		this.name = name;
		studentList.add(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static ArrayList<Student> getStudents() {
		return studentList;
	}
}

class Subject {
	private String name;

	private static ArrayList<Subject> subjectList = new ArrayList<>();

	public Subject(String name) {
		this.name = name;
		subjectList.add(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static ArrayList<Subject> getSubjects() {
		return subjectList;
	}
}
