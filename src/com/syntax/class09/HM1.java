package com.syntax.class09;

public class HM1 {

	public static void main(String[] args) {
	
		
		/*Create an array of animals and store 5 elements into it. 
		 * Using 2 different loops print all elements from the array.
		 */
		String[] animals= {"Dog","Cat","Leon","elephans","tiger"};
		for(int i=0;i<animals.length;i++) {
		System.out.println(animals[i]);
	}
		System.out.println("--------------------");
		for(String animal:animals) {
			System.out.println(animal);
		}
		
		
	}
}

