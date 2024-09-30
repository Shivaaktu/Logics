package com.shiva.spider.programbyownchoice;

public class HexToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is an statement from main method and beloe are the exanple of mehtod chaining");
		HexToDecimal o1=new HexToDecimal();
		o1.fun1().fun2().fun3();
	}
	
	public HexToDecimal fun1() {
		System.out.println("This is a line printed form mthod one and ");
		return  new HexToDecimal();
	}
	
	public HexToDecimal fun2() {
		System.out.println("This is a line printed from method two and ");
		return new HexToDecimal();
	}
	
	public void fun3() {
		System.out.println("This is a line printed from method three and ");
	}

}
