package com.shiva.spider.numberbsedprogram;

import java.util.Scanner;

//wajp to make method which shift all zeros on left side and all other numer on right sisde and print then while maintaining
//the order of the input number. ex input-2030680 and op- 0002368.
public class Sol10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println(zeroLHand(x));

	}
	
	public static int zeroLHand(int n) {
		int temp=0;
		int zero_insert=1;
		while(n>0) {
			int rem=n%10;
			if(rem!=0){
			temp=temp+rem*zero_insert;
			zero_insert=zero_insert*10;
			}
			else
				System.out.print(0);
			n=n/10;
		}
		System.out.println(temp);
		
		return temp;
	}

}
