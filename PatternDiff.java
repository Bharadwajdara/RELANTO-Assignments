package com.training.basic;

import java.util.Scanner;

public class PatternDiff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter ");
		 int number = sc.nextInt();
	    for (int i=0;i<4;i++) {
	        for (int j=0;j<i+1;j++) {
	            System.out.print(number++);
	            if (j!=i) System.out.print(" ");
	        }
	        System.out.println();
	    }
	}

	}

