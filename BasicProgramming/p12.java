package BasicProgramming;
//java program to take a char input from user and print that it is vowel or consonant.

import java.util.Scanner;


public class p12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any char ");
		char c=sc.next().charAt(0);
		
		checkConsonent(c);
		

	}
	
	public static boolean checkConsonent(char c) {
		c=Character.toLowerCase(c);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println(c+" is a vowel");
			return false;
		}else {
			System.out.println(c+" is a consonent");
			return true;
		}
	}

}
