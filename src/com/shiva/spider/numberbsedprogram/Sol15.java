package com.shiva.spider.numberbsedprogram;

import java.util.Scanner;

public class Sol15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any nymber for range");
		int h=sc.nextInt();
		doublePrime(h);
		sc.close();
	}
	
	public static int doublePrime(int h){
		int count=0;
		for(int i=2;i<=h;i++){
			if(chekPrime(i)&&chekPrime(getSumOfDigits(i))){
				System.out.println(i+" is a prime number and also digits sum is prime.");
				count++;
			}
		}
		System.out.println("Total prime upto range"+h+" are "+count);
		return count;
	}
	
	public static int getSumOfDigits(int n){
		int sum=0;
		while(n>0) {
			sum=sum+(n%10);
			n=n/10;
		}
		return sum;
	}
	
	public static boolean chekPrime(int n) {
		if(n<2)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	
}
