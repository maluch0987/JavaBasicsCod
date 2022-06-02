package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
		/*
		 * From an array of integer elements find the largest number.
		 */

		int[] num = { 2, 3, 4, 5 };
		int max = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println(max);

	}
}