//Q-1 wajp to take a user input  and count bits of that number.
package com.shiva.spider.numberbsedprogram;

import java.util.Scanner;

public class Sol1 {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number to count its bits");
		int n=sc.nextInt();
		System.out.println(n+" have total "+getBits(n)+" bits");
		System.out.println("Total  0 bits "+n+" have "+get0Bits(n));
		System.out.println("Total  1 bits "+n+" have "+get1Bits(n));
		proceedBits(n);
		System.out.println("Binay representation of "+n+" is "+getBinaryRepresentation(n));


	}
	
	public static int getBits(int n) {
		int cont=0;
		while(n>0) {
			cont++;
			n=n/2;
		}
		return cont;
	}
	
	public static int get0Bits(int n) {
		int count=0;
		while(n>0) {
			if(n%2==0)
				count++;
			n=n/2;
		}
		return count;
	}
	
	public static int get1Bits(int n) {
		int count=0;
		while(n>0) {
			if(n%2==1)
				count++;
			n=n/2;
		}
		return count;
	}
	
	public static String proceedBits(int n) {
		int total_count=0, count_0s=0, count_1s=0;
		
		while(n>0) {
			total_count++;
			if(n%2==0)
				count_0s++;
			else
				count_1s++;
			n=n/2;
		}
		System.out.println(n+" has total "+total_count+" bits and 0 and 1 bits are respectively "+count_0s+" and "+count_1s);
		return n+" has total "+total_count+" bits and 0 and 1 bits are respectively "+count_0s+" and "+count_1s;
	}
	
	public static String getBinaryRepresentation(int n) {
		String binary="";
		while(n>0) {
			int rem=n%2;
			binary=rem+binary;
			n=n/2;
		}
		return binary;
	}

}
	
