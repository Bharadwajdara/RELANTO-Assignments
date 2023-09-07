package com.training.quest2;

public class ScientificCalculator extends Basiccalculator implements IScientific {

	@Override
	public void square(int x) {
		// TODO Auto-generated method stub
		System.out.println("Square root " + Math.pow(x, 2));
		
	}

	@Override
	public void cube(int x) {
		// TODO Auto-generated method stub
		System.out.println("Square root " + Math.pow(x, 3));
		
	}

}
