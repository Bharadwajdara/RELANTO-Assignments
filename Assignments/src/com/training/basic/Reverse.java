package com.training.basic;
import java.util.Scanner;
public class Reverse {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int input=sc.nextInt();
		int reverse=0;
		while(input>0) {
			int last=input%10;//given number should get remainder and store in a variable
			reverse=reverse*10+last;//make initial reverse as *10 and add last
			input=input/10;//this is used to reduce number
			
		}
		System.out.println(reverse);
			
		}


	



		
		
		
		
		
		
		
	}
