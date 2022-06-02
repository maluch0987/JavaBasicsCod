package com.syntax.class09;

public class Array2 {

	public static void main(String[] args) {
	
		String[] fruits= {"Mango","apple","kiwi","pear","watermelon","melon/*"};
		
		System.out.println(fruits[2]);
		
		//fruits[4]="peach"; error
		System.out.println("My favorite fruits is "+ fruits[0]);//mango
		
		// i want to find a size of an array/how many elements?
		
		int size=fruits.length;
		System.out.println(size);

	}

}
