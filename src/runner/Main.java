package runner;

import java.util.Arrays;

import entities.Group;
import entities.Student;

public class Main {

	public static void main(String[] args) {

		Student st1 = new Student("Luda", 31);
		Student st2 = new Student("Peter", 27);
		Student st3 = new Student("Tanya", 18);
		Student st4 = new Student("Tanya", 18);
		Student st5 = new Student("Fyodor", 22);
		Student st6 = new Student("Misha", 17);
		Student st7 = new Student("Olya", 23);
		Student st8 = new Student("Dima", 32);
		Student st9 = new Student("Vasya", 27);
		Student st10 = new Student("Artyom", 26);
		Student st11 = new Student("Kolya", 30);
		Student st12 = new Student("Luda", 29);

		Group g1 = new Group(7);

		g1.addStudent(st1);
		g1.addStudent(st2);
		g1.addStudent(st3);
		g1.addStudent(st4);
		g1.addStudent(st5);
		g1.addStudent(st6);
		g1.addStudent(st7);

		g1.sortStudentComparable(st1);
	for (Student st : g1.getStudents()) {
			System.out.println(st.getName() + " " + st.getAge());
		}
		Arrays.sort(g1.getStudents());
		
		g1.sortStudentsByName();
		System.out.println(g1);
		
		//..Collections.sort
	}
	
	
}
