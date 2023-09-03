package com.training.basic;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int value=sc.nextInt();
		for(int i=1;i<=value/2;i++) {
			if(value%i==0) {
				sum=sum+i;
			if(sum==0) {
					System.out.println("perfect number");
				}
				else {
					System.out.println("not perfect number");
				}
			}
		}

	}

}
