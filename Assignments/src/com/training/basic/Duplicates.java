package com.training.basic;

public class Duplicates {

	public static void main(String[] args) {

		int[] array = { 1, 3, 6, 3, 2, 5, 7, 9, 6, 2, 2, 5, 8, 0, 2, 1, 3, 5, 7 };
		System.out.println("Duplicate elements are: ");

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j])
					System.out.println(array[j]);
			}

		}
	}
}