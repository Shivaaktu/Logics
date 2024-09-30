package com.shiva.spider.numberbsedprogram;

import java.util.Scanner;

//wajp to print all palindromne numbers in a range which are also prime numabers.
public class Sol18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sny number");
		int x=sc.nextInt();
		int count=0;
		
		for(int i=1;i<x;i++) {
			if(chekPalindrome(i)&&chekPrime(i)) {
				count++;
				System.out.println(i+" is a paindrome + prime");
			}
		}
		System.out.println("Total palindrom + prime are "+count);

	}
	
	public static boolean chekPalindrome(int x) {
		int temp=x;
		int rev=0;
		while(x>0) {
			rev=rev*10+(x%10);
			x=x/10;
		}
		return temp==rev;
	}
	
	public static boolean chekPrime(int x) {
		if(x<2)
			return false;
		for(int i=2;i<Math.sqrt(x);i++) {
			if(x%2==0)
				return false;
		}
		return true;
	}

}
