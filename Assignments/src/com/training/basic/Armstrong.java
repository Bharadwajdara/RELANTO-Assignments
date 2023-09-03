package com.training.basic;


public class Armstrong {

	public static void main(String[] args) {
		int input=153;
		int temp=input;
		int r,sum=0;
		
		while(input>0) {
		r=input%10;
		input=input/10;
		sum=sum+r*r*r;
		

		}
if(temp==sum) {
	System.out.println("its an armstrong");
}
	else {
		System.out.println("its not an armstrong");
	}
}
	}


