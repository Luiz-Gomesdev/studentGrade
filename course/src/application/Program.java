package application;

import java.util.Locale;
import java.util.Scanner;

import intities.StudentGrade;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		StudentGrade student = new StudentGrade();
		
		System.out.println("Student Name: ");
		student.name = sc.nextLine();
		System.out.println("Student Grade 1: ");
		student.grade1 = sc.nextDouble();
		System.out.println("Student Grade 2: ");
		student.grade2 = sc.nextDouble();
		System.out.println("Student Grade 3: ");
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINT%n", student.missingPoints());
		}else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
