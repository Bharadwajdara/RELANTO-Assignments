package com.training.scan;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String[] names = { "Bharath", "krishna", "shashank", "Yashwanth", "Hussain" };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name");
		String input = sc.next();

		boolean result = false;

		for (String name : names) {
			if (name.equals(input)) {
				result = true;
				break;
			}
		}

		if (result) {
			System.out.println("You are logged in");
		} else {
			System.out.println("Invalid username");
		}

	}

}
