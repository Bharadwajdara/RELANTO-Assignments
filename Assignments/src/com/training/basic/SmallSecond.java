package com.training.basic;

public class SmallSecond {

	public static void main(String[] args) {
		int []array= {20,57,27,26,2,14,63};
		System.out.println(array.length);
		//int min=array[0];
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]<array[j]) {
					int small=array[i];
					array[i]=array[j];
					array[j]=small;
					
				}
			}
		}

		
System.out.println("SmallerSecond is "+array[array.length-2]);
	
	}
}