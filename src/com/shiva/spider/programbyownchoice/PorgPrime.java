package com.shiva.spider.programbyownchoice;

import java.util.Scanner;

public class PorgPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lower bound and upper bound");
		int l=sc.nextInt();
		int u=sc.nextInt();
		System.out.println("Total prime between "+l+" and "+u+" are "+countPrime(l,u));
		
	}
	
	public static boolean checkPrime(int x) {
		if(x<2)
			return false;
		for(int i=2;i<=Math.sqrt(x);i++) {
			if(x%i==0)
				return false;
		}
		System.out.println(x+" is prime");
		return true;
	}
	
	public static int countPrime(int l, int u) {
		int count=0;
		for(int i=l;i<=u;i++) {
			if(checkPrime(i))
				count++;
		}
		return count;
	}

}
