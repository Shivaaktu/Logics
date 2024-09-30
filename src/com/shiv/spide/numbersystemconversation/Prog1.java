package com.shiv.spide.numbersystemconversation;

public class Prog1 {
//wajp to convert a decimal to binary.ex ip 28  and op 11101.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decimalToBinary(79));
	}
	
	public static int decimalToBinary(int x) {
		int binary=0;
		int count=1;
		while(x>0) {
			int rem=x%2;
			if(rem==1){
				rem=rem*count;
				binary=binary+rem;
				count=count*10;
			}
			else {
				count=count*10;
			}
			x=x/2;
		}
		return binary;
	}
	
	

}
