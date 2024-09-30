package com.shiva.spider.pattern;

public class Pr6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(21);

	}
	
	public static void pattern(int n){
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.printf("%-4d",k);
				k++;
			}
			System.out.println();
		}
	}

}
