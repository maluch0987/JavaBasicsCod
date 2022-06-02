package com.syntax.class09;

public class Arraywords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words= {"Java","Saturday","day"};
		//I want retrieve all elements
		for(int i=0;i<words.length;i++) {
			System.out.print(words[i]+" ");
		}
		
		System.out.println();
		/*enhanced for loop/advanced for loop/for each loop
		CAN BE USED ONLY WHEN WE WORK WITH ARRAY
		            or
		             collections
		
		*/
		String[] colors= {"pink","blue","White","black"};
		for(String color:colors) {
			System.out.print(color+" ");
		}
	}

}
