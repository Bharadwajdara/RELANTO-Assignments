package com.training.basic;



public class ReverseArray {

	public static void main(String[] args) {
		int []array= {1,2,3,5,7,3,6,8};
		int start,end;
		start=0;
		end=array.length-1;
		while(start<=end) {
			int temp=array[start];
			array[start]=array[end];
			array[end]=temp;
			start++;end--;
			
		}
			for(int values:array) {
				
			}
			
				System.out.println(values);
			}
	}

