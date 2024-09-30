package com.shiva.spider.programbyownchoice;
//java Program to find Hcf of three numbers.
import java.util.Scanner;
public class Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any therr numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Hcf is "+findHcf(a,b,c));
	}
	
	public static int findHcf(int a, int b, int c) {
		int small=(a<b)?((a<c)?a:c):((b<c)?b:c);
		System.out.println("Smallset number is "+small);
		for(int i=small; ;i-=1){
			if(a%1==0&&b%i==0&&c%i==0)
				return i;
		}
	}

}
