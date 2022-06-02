package com.syntax.class09;

public class HM3 {

	public static void main(String[] args) {
	/*
	 * Create an array on integers and calculate the sum of all elements in an array
	 */
int[]num= {5,76,43,78};
 int sum=0;
for(int i=0;i<num.length;i++) {
	sum+=num[i];
}
System.out.println(sum);
System.out.println("-----------");
int[]num1= {5,76,43,78};
int sum1=0;
	for(int n:num1) {
		sum1+=n;}
		System.out.println(sum1);

}
}