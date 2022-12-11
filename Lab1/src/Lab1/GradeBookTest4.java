package Lab1;

import java.util.Scanner;
import practice2.Student;

public class GradeBookTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		Student s1 = new Student("A");
		Student s2 = new Student("B");
		Student s3 = new Student("C");
		Student s4 = new Student("D");
		Student s5 = new Student("E");
		Student s6 = new Student("F");
		Student s7 = new Student("G");
		Student s8 = new Student("H");
		Student s9 = new Student("I");
		Student s10 = new Student("J");
		
		Course oop = new Course("CSCI 2106", "Object-Oriented Programming and Design", 5, "CSCI 1203");
		
		GradeBook4 book = new GradeBook4(oop);
		book.displayMessage();
		
		
		int studentId = 1;
		
		for(Student cur: Student.students) {
			System.out.print(studentId + ". " + cur.name + ": ");
			int studentScore = sc.nextInt();
			book.addStudent(cur.name ,studentId, studentScore);
			studentId++;
		}
		

		System.out.println(book.displayGradeReport());
	
		sc.close();
	}

}
