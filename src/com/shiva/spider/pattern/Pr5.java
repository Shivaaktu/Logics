package com.shiva.spider.pattern;

public class Pr5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(11);

	}
	public static void pattern(int n) {
		int mid=(n+1)/2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==mid||j==mid)
					System.out.print("* ");
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
