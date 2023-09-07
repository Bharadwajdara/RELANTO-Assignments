package com.training.quest5;

import java.util.function.BiConsumer;

public class BiConsumerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<String, Integer> biConsumer = (name, age) -> {
			if (name.equals("Admin") && age > 30) {
				System.out.println("Welcome Admin");
			} else {
				System.out.println("Wrong User");
			}
		};
		biConsumer.accept("Admin", 20);

	}

}
