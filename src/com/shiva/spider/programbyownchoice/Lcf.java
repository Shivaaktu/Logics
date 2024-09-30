package com.shiva.spider.programbyownchoice;

import java.util.Scanner;

//java program to find LCM of GCD of three numbers.
public class Lcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any therr numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Hcf is "+getLcm(a,b,c));

	}
	
	public static int getLcm(int a, int b, int c) {
		int big=(a>b)?((a>c)?a:c):((b>c)?b:c);
		for(int i=big; ;i+=big) {
			if(i%a==0&&i%b==0&&i%c==0) {
				return i;
			}
		}
	}

}
