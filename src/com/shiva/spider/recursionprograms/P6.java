package com.shiva.spider.recursionprograms;

public class P6 {
static int rev=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rev(123456);
		System.out.println(rev);
	}
	
	public static void rev(int n) {
		if(n>0){
			rev=rev*10+n%10;
			rev(n/10);
		}
	}

}
