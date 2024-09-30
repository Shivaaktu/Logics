package com.shiva.spider.recursionprograms;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFactorial(134);

	}
	
	public static void printFactorial(int n) {
			System.out.println("Factorial of "+n%10+" is "+getFactorial(n%10));
			if(n>0)
				printFactorial(n/10);
	}
	
	public static int getFactorial(int n) {
		int fact=1;
		if(n>1) {
			fact=n*getFactorial(n/10);
		}
		return fact;
	}

}
