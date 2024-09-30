package com.shiva.spider.recursion.type1;

public class P1 {

	public static void main(String[] args) {
		//wapj to get sum of all natural number unto n ?
		// In this program we  need to get an int input from user and make a function to add recursively all numbers we have two approach to solve this type of 
		//program first is to take a static global variable and proceed in it.
		
		System.out.println(getSum(10));
	}
	public static int getSum(int n) {
		int sum=0;
		if(n>1)
			sum=sum+getSum(n-1);
		return sum;
	}
	
}
