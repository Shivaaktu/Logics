package com.shiva.spider.recursion.type1;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//java program to calculate factorial by recursion 
		System.out.println(getFactorial(6));

	}
	
	public static int getFactorial(int n) {
		if(n<=1)
			return 1;
		int fact=n;
		if(n>1)
			fact=fact*getFactorial(n-1);
		return fact;
	}

}
