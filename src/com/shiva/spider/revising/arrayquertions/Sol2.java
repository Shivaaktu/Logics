package com.shiva.spider.revising.arrayquertions;
import java.util.Scanner;
public class Sol2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter divident and diviosor to check divisiblity");
		int x=sc.nextInt();
		int y=sc.nextInt();
		chekDivisiblity(x,y);
	}
	
	public static void chekDivisiblity(int dividend, int divisor) {
		String[] ars= {"Divisible"};
		try {
			System.out.println(ars[dividend%divisor]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Not divisible");
		}
	}
	

}
