package com.training.basic;

public class Fibbonaci {

	public static void main(String[] args) {
		int input = 20;
		int  value1= 0;
		int value2 = 1;
		for (int i=1;i<=input;i++) {
			int sum = value1 + value2;
            value1 = value2;
            value2 = sum;
            System.out.print(value1+" ");
	}

}
}