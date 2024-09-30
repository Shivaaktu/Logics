package com.shiva.spider.programbyownchoice;

import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		byte choice=sc.nextByte();
		getNumChoice(n,choice);
		sc.close();
	}
	
	public static long getNumChoice(long n, byte choice) {
		long ret=0;
		while(n>0) {
			byte rem=(byte)(n%10);
			if(rem!=choice) {
				ret=ret*10+rem;
			}
			n=n/10;
		}
		System.out.println(ret);
		return ret;
	}

}
