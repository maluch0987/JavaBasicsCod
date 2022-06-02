package com.syntax.class10;

public class Task12 {

	public static void main(String[] args) {
		String[][] usa = {
				{ "New York", "Albany", "Buffalo" },
				{ "Los Angels", "San Francisco", "San Jose", "San Diego", "Redding" },
				{ "Miami", "Orlando", "Niceville", "Tampa" }, 
				{ "McLean", "Richmond", "Leesburg" }
		};
		for(String[]state:usa) {
			for(String city:state) {
				System.out.print(city+" ");
			}
			System.out.println();
		}
		
		
		
	

	}

}
