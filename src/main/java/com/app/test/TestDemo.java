package com.app.test;

import java.util.Arrays;

class TestDemo { 

	public static void main(String[] args){ 
		int[] i= {45,46,47,48,49,50,52,53};
		int n=53;
       int n1=44;
		int idealSum=((n*(n+1))/2)-((n1*(n1+1))/2);
		int sum=Arrays.stream(i).sum();
	     int missNo=idealSum-sum;
	     System.out.println(missNo);
	}
}