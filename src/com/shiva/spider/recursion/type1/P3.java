package com.shiva.spider.recursion.type1;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getPower(2,3));

	}
	
	public static int getPower(int base, int exp) {
		if(base==1||exp==0)
			return 1;
		int power=base;
		if(exp>1)
			power=base*getPower(base,exp-1);
		return power;
	}

}
