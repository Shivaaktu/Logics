package com.shiva.spider.recursionprograms;

public class P2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stu10
		print(10);
		

	}
	
	public static void print(int n){
		if(n>0){
			System.out.println(n);
			print(n-1);
		}
	}

}
