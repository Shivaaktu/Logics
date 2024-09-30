package com.shiva.spider.programbyownchoice;
//wajp to calculate HCF of three numbers
public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans=getHcf(15,16,17);
		System.out.println(ans);

	}
	
	public static int getHcf(int a, int b, int c) {
		int small=(a>b)?(a<c?a:c):(a<c?a:c);
		
		for(int i=small; ; i--) {
			if(a%i==0&&b%i==0&&c%i==0) {
				return i;
			}
		}
	}

}
