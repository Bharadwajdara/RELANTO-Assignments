package com.training.basic;

public class Pyramid1 {

	public static void main(String[] args) {
		int prows = 5;
		for (int i = 1; i <= prows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
