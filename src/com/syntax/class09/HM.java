package com.syntax.class09;

public class HM {

	public static void main(String[] args) {
		/*Create an array of cars and store 6 elements into it. 
		 * Using 2 different loops print all values from the array.
    */
		
		String[] cars=new String[6];
		cars[0]="BMW";
		cars[1]="Ford";
		cars[2]="Lexus";
		cars[3]="Mersedes";
		cars[4]="Lingoln";
		cars[5]="Audi";
for(int i=0;i<cars.length;i++) {
	System.out.println(cars[i]);
}
System.out.println("-----------------");
int k=0;
while(k<cars.length) {
	System.out.println(cars[k]+" ");
	k++;
}
	}

}
