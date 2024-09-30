package com.shiva.spider.recursion.type1;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//design a java program to print all numbers from 1 to 100 in increasing order
		//design a java proraam to print all the numbers from 100 to 1 in decreasing order=
		
		printIncr(100);

	}
	
	public  static void printIncr(int n) {
		if(n>1)
			printIncr(n-1);
		System.out.println(n);
		
			
	}

}
