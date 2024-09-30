package com.shiva.spider.programbyownchoice;

import java.util.Scanner;

//wajp to design a method which get a input from user and the return a new number in such a way to get all even digits on 
//left hand and odd digits on right hand.
public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number and get all even on left side and all odd on right side");
		
		System.out.println(evenROddLHand(sc.nextInt()));
		sc.close();
	}
	
	public static int evenROddLHand(int n) {
		int even=0;
		int odd=0;
		int dc=0;
		
		while(n>0) {
			int rem=n%10;
			if(rem%2==0) 
				even=even*10+rem;
			else{
				odd=odd*10+rem;
				dc++;
			}
			n=n/10;
		}
		even=revNum(even);
		while(dc>0){
			even=even*10;
			dc--;
		}
		
		return even+revNum(odd);
	}
	
	public static int revNum(int n) {
		int temp=0;
		while(n>0) {
			temp=temp*10+(n%10);
			n=n/10;
		}
		return temp;
	}
		

}
