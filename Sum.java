package com.training.basic;

public class Sum {

	public static void main(String[] args) {
		int []array= {10,20,30,40,50};
		System.out.println(array.length);
		int sum=0;
		int avg;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
			
			}
		System.out.println(sum);
		avg=sum/array.length;
		System.out.println(avg);
	}

}
