package com.syntax.class10;

public class ArrayLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] disney={"Shrek", "Elsa", "Goofy", "Mulan"};
		System.out.println(disney[1]);
		//to get all elements from array
		
		for(int i=0;i<disney.length; i++) {
			if (disney[i].equalsIgnoreCase("Shrek")) {
			System.out.println(disney[i]);
		}else {
			System.out.println(disney[1]);
		}
		for(String character:disney) {
			
			if(character.equalsIgnoreCase("Mulan")) {
			System.out.println(character+ " is my favorite character");	
			continue;
			}else {
				
			
			System.out.println(character+" ");
		}
		}
	}
	}
}
