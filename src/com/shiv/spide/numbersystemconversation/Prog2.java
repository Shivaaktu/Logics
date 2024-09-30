package com.shiv.spide.numbersystemconversation;
//java prog to convert binary to decimal
public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(binaryToDecimal(1001111));
	}
	
	

	public static int binaryToDecimal(int x) {
		int decimal=0;
		int mul=1;
		while(x>0) {
			int rem=x%10;
			if(rem>1) {
				System.out.println("not a valid input");
				return 0;
			}
			decimal=decimal+rem*mul;
			x=x/10;
			mul=mul*2;
		}
		return decimal;
	}

}
