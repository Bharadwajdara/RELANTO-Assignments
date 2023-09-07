package com.training.except;

public class MainExcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CourseDetails course = new CourseDetails();
		try {
		course.showCourses("java");
		}
		catch(Exception e){
			System.out.println("Course Details not found");
			e.printStackTrace();
		}

	}

}
