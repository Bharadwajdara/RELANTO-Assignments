package com.training.scan;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {

			String[] names = {"Bharath","Shashank","Krishna","yashwanth","Hussain"}; 
	        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a name to register: ");
	        
	        String input = sc.nextLine();

	        boolean isUnique = true;
	        for (String username : names) {
	            if (username.equals(input)) {
	                isUnique = false;
	                break;
	            }
	        }

	        if (isUnique) {
	            System.out.println("You are registered.");
	        } else {
	            System.out.println("Name is not unique.");
	        }

	}

}
