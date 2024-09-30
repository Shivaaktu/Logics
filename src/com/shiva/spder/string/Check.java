package com.shiva.spder.string;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("maingag");
		String s="sg@# s$%& geHr35464Gdv sg";
		System.out.println("Length of stirng is "+getLength(s));
		
		
		
	}
	
	public static int getLength(String s) {
		s=s+"\0";
		return s.indexOf("\0");
	}

}
