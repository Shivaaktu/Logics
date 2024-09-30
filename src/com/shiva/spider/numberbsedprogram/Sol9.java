package com.shiva.spider.numberbsedprogram;
//write a java program to get all even digit on left side and odd in right side.
import java.util.Scanner;

public class Sol9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int g=evenOddOnOppositeSide(n);
		System.out.println("From main method "+g);

	}
	
	public static int evenOddOnOppositeSide(int n) {
		int even=0;
		int odd=0;
		int zero_insert_e=1;
		int zero_insert_o=1;
		
		while(n>0) {
			int rem=n%10;
			if(rem%2==0) {
				even=even+rem*zero_insert_e;
				zero_insert_e=zero_insert_e*10;
			}
			else {
				odd=odd+rem*zero_insert_o;
				zero_insert_o=zero_insert_o*10;
			}
			n=n/10;
		}
//		System.out.println("zero e "+zero_insert_e);
//		System.out.println("zero o "+zero_insert_o);
		System.out.print(even);
		System.out.println(odd);
		
		return (even*zero_insert_o)+odd;
	}

}
