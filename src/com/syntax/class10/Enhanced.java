package com.syntax.class10;

public class Enhanced {

	public static void main(String[] args) {
		int [][]nums= {
				{1,2,3,4,5},
				{199,300,588,700},
				{1900,4578,98787}};

		/*
		 * enhanced for loop uses variables to access elements from an array
		 *  outer for loop ->iterates over 1D array
		 *  inner loop -->Iterates over elements of each 1d array
		 */
		System.out.println("All values using enhanced for loop");
		
		for(int[] num:nums){
		for(int n:num) {
			
	
			System.out.println(n);
		}
			
		}
		
		
	}

}
