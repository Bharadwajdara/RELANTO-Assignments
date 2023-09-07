package com.training.except;

public class CourseDetails {

	void showCourses(String course) {
		try {
			System.out.println("Welcome to the java Course ");
			if (course.equals("java")) {
				System.out.println("Welcome to the " + course + " java course");
			}
		} catch (Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
			throw e;
		} finally {
			System.out.println("Connection is closed");
		}
	}

}
