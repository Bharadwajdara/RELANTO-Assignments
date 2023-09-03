package com.training.scan;

import java.util.Scanner;

public class GreatestScan {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number:");
		int input1=sc.nextInt();
		System.out.println("Enter Second number:");
		int input2=sc.nextInt();
		System.out.println("Enter third number:");
		int input3=sc.nextInt();
		
		int result=(input1>input2 && input1>input3)?input1:(input2>input3)?input3:input3;
		
		System.out.println(result);

	}

}
