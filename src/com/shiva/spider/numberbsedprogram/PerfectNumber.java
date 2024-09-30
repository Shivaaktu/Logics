package com.shiva.spider.numberbsedprogram;
//wajp to chek a number is perfect or not. If the sum of factors of a numbe is equal to the number itself then it is a perfect number.
//ex  2
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPerfect(1));

	}
	
	public static boolean checkPerfect(int x) {
		int sum_of_factors=0;
		for(int i=1;i<Math.sqrt(x);i++) {
			if(x%i==0) {
				sum_of_factors=sum_of_factors+i;
			}
		}
		return sum_of_factors==x;
	}

}
