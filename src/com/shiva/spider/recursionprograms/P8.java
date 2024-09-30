package com.shiva.spider.recursionprograms;

import java.util.Scanner;

public class P8 {
static int rev=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter any number to check it is reverse or not");
		int n=sc.nextInt();
		checkReverse(n);
		
	}
	
	public static void checkReverse(int n) {
		if(n>0) {
			rev=rev*10+n%10;
			checkReverse(n/10);
		}
		if(n==0)
			System.out.println("yes palindrom");
		else
			System.out.println("Not palindrom");
	}

}
