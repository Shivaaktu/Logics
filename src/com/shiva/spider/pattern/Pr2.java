package com.shiva.spider.pattern;

public class Pr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(7);
	}
	
	public static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((j+1)%2+"   ");
			}
			System.out.println();
		}
	}

}
