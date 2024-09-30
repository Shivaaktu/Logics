package com.shiva.spider.recursionprograms;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number to get its factorail");
		int n=sc.nextInt();
		System.out.println("Factorail of "+n+" is "+factorial(n));
		sc.close();

}
	public static int factorial(int n) {
		int fact=n;
		if(n>1){
			fact=n*factorial(n-1);
		}
		return fact;
	}

}
