package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {
		// Create an array to store char values and then print those in reverse order
		char[] ch = { 'A', 'B', 'C', 'D' };
for(int i=ch.length -1;i>=0;i--) {
	System.out.print(ch[i]+" ");
}
	}

}
