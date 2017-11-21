package entities;

import java.util.Arrays;

public class Group extends StudentComparator {

	private Student[] students; // объ€вление массива
	private int counter = 0; // счетчик дл€ увеличени€ кол-ва студентов в массиве

	public Group(int size) {
		students = new Student[size]; // конструктор дл€ инициализации объекта
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public void addStudent(Student student) {
		students[counter] = student;
		counter++;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + counter;
		result = prime * result + Arrays.hashCode(students);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Group other = (Group) obj;
		if (counter != other.counter)
			return false;
		if (!Arrays.equals(students, other.students))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Group [students=" + Arrays.toString(students) + ", counter=" + counter + "]";
	}

	// Comparable
	public void sortStudentComparable(Student st) {
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				students[i].compareTo(students[j]);
				Student tempValue = students[j];
				students[j] = students[i];
				students[i] = tempValue;
			}
		}
	}
	public void sortStudentsByAge() {
		int max = 0;
		int i = 0;

		for (int x = 0; x < students.length; x++) { // a.length = # of indices in the array
			for (int y = 0; y < students.length; y++) {
				if (students[x].getAge() < students[y].getAge()) {
					Student tempValue = students[y];
					students[y] = students[x];
					students[x] = tempValue;
				}
			}
		}
	}

	// Comparator
	public void sortStudentsByName() {
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				compare(students[i], students[j]);
				Student tempValue = students[j];
				students[j] = students[i];
				students[i] = tempValue;	
			}
	}
}
}
