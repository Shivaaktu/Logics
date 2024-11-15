package BasicProgramming;

import java.util.Scanner;

public class LoopBased1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stdb
		System.out.println(printPower(2,50));
		

	}

	private static long printPower(int base, int exp) {
		if(base==1||exp==0)
			return 1;
		return base*printPower(base,exp-1);	
	}

	private static int printFactoril(int x){
		if(x<=1)
			return 1;
		return x*printFactoril(x-1);
	}
	

	private static void countEvenDigit(int x) {
		System.out.print(x);
		int count=0;
		while(x>0) {
			byte rem=(byte)(x%10);
			if(rem>=5)
				count++;
			x=x/10;
		}
		System.out.println(" has "+count+" 5r digits");
	}

	private static void countDigit(int x) {
		System.out.print(x);
		int count=0;
		while(x>0) {
			count++;
			x=x/10;
		}
		System.out.println(" has "+count+" digits");
	}

	private static boolean checkPrime(int x) {
		for(int i=2;i<=Math.sqrt(x);i++) {
			if(x%i==0) {
				System.out.println("Not primr "+i);
			return false;
			}
		}
		System.out.println("Is prime");
		return true;
	}

	private static void printFactor(int x) {
		int count=0;
		for(int i=1;i<=(x/2);i++) {
			if(x%i==0)
				count++;
		}
		System.out.println(count);
		
	}

	private static void print7() {
		// TODO Auto-generated method stub
		for(int i=7;i<=500;i++) {
			if(i%7==0&&i%10==7)
			System.out.println(i+" ");
		}
		
	}
	
	

}
