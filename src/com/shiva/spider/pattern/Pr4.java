package com.shiva.spider.pattern;

public class Pr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for pattern 
//		* * * * * * * * * * * 
//		*         *         * 
//		*         *         * 
//		*         *         * 
//		*         *         * 
//		* * * * * * * * * * * 
//		*         *         * 
//		*         *         * 
//		*         *         * 
//		*         *         * 
//		* * * * * * * * * * * 

		pattern(11);
	}
	public static void pattern(int n) {
		int mid=n/2+1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||j==1||i==n||j==n||i==mid||j==mid)
					System.out.print("* ");
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
