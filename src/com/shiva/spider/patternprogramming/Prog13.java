package com.shiva.spider.patternprogramming;

public class Prog13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(7);

	}
	public static void pattern(int n) {
		int star=1;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			
			
			if(i<n/2+1)
				star++;
			else
				star--;
			System.out.println();
		}
	}

}
