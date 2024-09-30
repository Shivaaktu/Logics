package com.shiva.spider.recursionprograms;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(10);

	}
	
	public static void print(int n) {
		if(n>0) {
			print(n-1);
			System.out.println(n);
		}
		
	}

}
