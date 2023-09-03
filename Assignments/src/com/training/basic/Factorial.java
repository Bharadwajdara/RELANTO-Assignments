package com.training.basic;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value");
		int value=sc.nextInt();
		int factorial=1;
		for(int i=1;i<=value;i++) {
			factorial*=i;
			
		}
System.out.println("Factorial is"+factorial);
	}

}
