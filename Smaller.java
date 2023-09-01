package com.training.basic;

public class Smaller {

	public static void main(String[] args) {
		int []max = new int[3];//declare an aray with size
		System.out.println(max[0]);
		System.out.println(max.length);
		max[0]=20;
		max[1]=40;
		max[2]=60;
		if(max[0]<max[1] & max[0]<max[2]) {
			System.out.println("Smaller value is "+max[0]);
		}
			else if(max[1]<max[2]){
				System.out.println("Smaller value is "+max[1]);
			}
			else {
				System.out.println("Smaller value is "+max[2]);
			}

		

	}

	}


