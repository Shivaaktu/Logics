//wajp to get a number from user which has only 0s and 1s. s 
//And you have to shift all 1s on right hand side and all 0s on left hand side
package com.shiva.spider.numberbsedprogram;

import java.util.Scanner;

public class Sol8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		set0s1s(n);

	}
	
	public static int set0s1s(long n) {
		long ret=0;
		while(n>0) {
			if(n%10==0) {
				System.out.print("0");
			}
			else
				ret=ret*10+1;
			n=n/10;
		}
		System.out.println(ret);
		return 1;
	}

}
