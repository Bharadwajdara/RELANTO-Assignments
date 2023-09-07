package com.training.quest3;

import java.util.function.Consumer;

public class LambdaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> consumer = a -> {
			int b = 10;
			System.out.println(a + b);
		};
		consumer.accept(20);

	}

}
