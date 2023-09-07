package com.training.quest4;

import java.util.function.Supplier;

public class SupplierMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> supplier=()->{
			String name="Bharadwaj Daa";
			String upperName=name.toUpperCase();
			return upperName;
		};
		System.out.println(supplier.get());

	}

}
