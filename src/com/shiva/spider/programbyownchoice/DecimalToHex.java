package com.shiva.spider.programbyownchoice;

public class DecimalToHex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getDecimalToHex(115));

	}
	
	public static String getDecimalToHex(int x){
		String hex="";
		while(x>0) {
			int rem=x%16;
			if(rem>9) {
				char c=(char)(rem+55);
				hex=c+hex;
			}
			else {
				hex=rem+hex;
			}
			x=x/16;
		}
		return hex;
	}

}
