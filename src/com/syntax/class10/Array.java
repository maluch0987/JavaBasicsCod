package com.syntax.class10;

public class Array {

	public static void main(String[] args) {
		//Maximum and minimum number in the array?

		int[] num = { 2,-897532, 245678, 87,-754,876, 7653,-86,65749};
		int max=num[0];
		int min=num[0];
		for (int i = 0; i < num.length; i++) {
			if(num[i]<min)min=num[i];
			if(num[i]>max)max=num[i];	
				
			}
		System.out.println("The minimum number in the array "+ min);
      System.out.println("The maximum number in the array "+ max);
		
		
	}

}
