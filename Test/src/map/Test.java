package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Student nitish = new Student("Nitish");
		Student suresh = new Student("Suresh");
		Student prajil = new Student("Prajil");
		Student sandeep = new Student("Sandeep");

		while (true) {
			System.out.println("Enter the number of questions");
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			int i = 0;
			
			Map<String, List<Integer>> studentMap = new HashMap<>();
			
			
			while (i < num) {
				System.out.println("Score for question number " + (i + 1));
				for (Student student : Student.getAllStudent())
				{
					System.out.println("Enter the marks obtained by " + student.getName());
				
					int mark = scanner.nextInt();

					if (!studentMap.containsKey(student.getName())) {
						List<Integer> marks = new ArrayList<>();
						marks.add(mark);
						studentMap.put(student.getName(), marks);
					} else {
						studentMap.get(student.getName()).add(mark);
					}
				}

				i++;
			}
			for(Entry<String,List<Integer>> map : studentMap.entrySet())
			{
				int total = 0;
				
				for(int j : map.getValue())
				{
					total+=j;
				}
				System.out.println(map.getKey() +" obtained "+total);
			}
		}
	}
}

class Student {
	private String name;
	private static List<Student> studentList = new ArrayList<>();

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

	@Override
	public String toString() {
		return name;
	}

	public static List<Student> getAllStudent() {
		return studentList;
	}

}