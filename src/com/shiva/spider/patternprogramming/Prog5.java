package com.shiva.spider.patternprogramming;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}

}

// If column value is changes then it is achieved by inner loop.
// And if we need to make changes on row then it is achieved by outer loop.
