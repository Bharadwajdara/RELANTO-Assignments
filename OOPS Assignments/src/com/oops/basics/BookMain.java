package com.oops.basics;

public class BookMain {

	public static void main(String[] args) {
		Book book1=new Book("Bharath","Krishna",9800);
		book1.getDetails();
		book1.checkBook();
		System.out.println();
		Book book2=new Book("Shashank","Yaswanth",7600);
		book2.getDetails();
		book2.checkBook();

	}

}
