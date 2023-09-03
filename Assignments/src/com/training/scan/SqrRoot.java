package com.training.scan;

import java.util.Arrays;
import java.util.Scanner;

public class SqrRoot {

	public static void main(String[] args) {
		int[] array=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		int[] arr2=new int[array.length];
		
		for(int i=0;i<array.length;i++)
		{
			arr2[i]=(int)Math.sqrt(array[i]);
		}
		System.out.println(Arrays.toString(arr2));

	}

}
