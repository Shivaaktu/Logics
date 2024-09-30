package com.shiva.spider.recursionprograms;

import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base");
		int base=sc.nextInt();
		System.out.println("Enter exponent");
		int exponent=sc.nextInt();
		System.out.println(getPower(base,exponent)+" is the power");
		
	}
	
	public static int getPower(int base, int exponent) {
		if(base==0&&base!=0)
			return 0;
		if(exponent==0||base==1)
			return 1;
		int power=base;
		if(exponent>1){
			power=power*getPower(base,exponent-1);
		}
		return power;
	}

}
