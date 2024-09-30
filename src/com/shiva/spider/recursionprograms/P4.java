package com.shiva.spider.recursionprograms;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSum(5));

	}
	
	public static int getSum(int n) {
		int sum=n;
		if(n>0) {
			sum=sum+getSum(n-1);
		}
		return sum;
	}

}
