package com.oops.basics;

public class StudentMain {

	public static void main(String[] args) {
		Student student1 = new Student("Bharath", "ECE");
		student1.printDetails();
		System.out.println("Grade is "+student1.getGrades(50,40,75));
		System.out.println();
		
		Student student2 = new Student("Avinash", "EEE");
		student2.printDetails();
		System.out.println("Grade is "+student2.getGrades(90,90,75));

	}

}
