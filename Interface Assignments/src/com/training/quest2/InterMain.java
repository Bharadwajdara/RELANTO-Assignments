package com.training.quest2;

public class InterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICalculator calculator = new Basiccalculator();
		calculator.add(4, 9);
		calculator.difference(35, 13);
		calculator.product(30, 5);
		calculator.divide(100, 5);
		System.out.println();
		
		IScientific scientific = new ScientificCalculator();
		scientific.add(20,60);
		scientific.difference(120, 72);
		scientific.product(45, 2);
		scientific.divide(100, 2);
		scientific.square(7);
		scientific.cube(3);

	}

}
