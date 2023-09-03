package com.training.basic;

import java.util.Arrays;

public class LargeSecond {

	public static void main(String[] args) {
		int[] array = { 26, 63, 75, 31, 54 };
		Arrays.sort(array);
		System.out.println(array[array.length - 2]);

	}

}
