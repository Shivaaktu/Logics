package com.shiva.spider.pattern;
public class pr1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern4(6);
	}

	public static void pattern3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((i+j)>=(n+1))
					System.out.print("*   ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void pattern4(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j>=n+1)
					System.out.print("*   ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
