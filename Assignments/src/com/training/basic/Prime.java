package com.training.basic;

public class Prime {

	public static void main(String[] args) {
		int input = 28;

		boolean isPrime = true;

		for (int i = 2; i <= input; i++) {
			if (input % 2 == 0) {

				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println("Its a prime number");
		} else {
			System.out.println("not prime number");
		}
	}

}
