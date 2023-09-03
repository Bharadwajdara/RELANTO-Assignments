package com.training.scan;

import java.util.Scanner;

public class OneDimArray {

	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int value : array) {
			value = sc.nextInt();
			sum += value;
		}
		System.out.println(sum);
		double average = sum / array.length;
		System.out.println(average);
	}

}
