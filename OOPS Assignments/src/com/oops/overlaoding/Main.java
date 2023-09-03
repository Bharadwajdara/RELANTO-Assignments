package com.oops.overlaoding;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee("Bharath", "Manager");
		double ans = employee.calcBonus(20.6, 18.7);
		System.out.println(ans);
		Employee employee1 = new Employee("Shashank", "Daydreamer");
		double result = employee1.calcBonus(28.76);
		System.out.println(result);
		Employee employee2 = new Employee("Yashwanth", "Developer");
		double output = employee2.calcBonus(29.6, 13.76, 19.27);
		System.out.println(output);

	}

}
