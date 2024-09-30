package com.shiva.spider.patternprogramming;

public class Prog14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(9);

	}
	
	
	public static void pattern(int n) {
		int star=1; int space=n/2;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=space;j++) {
				System.out.print("  ");//reduce one space hare to print diamond.
			}
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			
			
			if(i<n/2+1) {
				space--;
				star++;
			}
			else {
				space++;
				star--;
			}
			System.out.println();
		}
	}

}
