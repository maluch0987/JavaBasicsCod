package com.syntax.class10;

public class MinMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] num= {2,4,5,6,-87,7,8,-86324,546,2412};
int max=num[0];
int min=num[0];
	for(int i =0;i<num.length;i++) {
	if(num[i]>max)max=num[i];
	if(num[i]<min)min=num[i];;
	
	}
	System.out.println(max+" "+min);
	
		
		
	}

}
