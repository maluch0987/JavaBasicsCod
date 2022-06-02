package com.syntax.class09;

public class HM2 {

	public static void main(String[] args) {
		/*Create an array to store double values and then print 
		 * all elements using 2 different loops
		 */
Double[]d= {1.45,2.45,3.45};
for(int i=0;i<d.length;i++) {
	System.out.println(d[i]);
}
System.out.println("------------");

for(Double s:d) {
	System.out.println(s);
}
	}

}
