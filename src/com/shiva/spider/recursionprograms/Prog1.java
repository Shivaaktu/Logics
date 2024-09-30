package com.shiva.spider.recursionprograms;

public class Prog1 {

	public static void main(String[] args) {
		// This is first program on recursion it is an uncontrolled recursion. 
		test();
	}
	
	public static void test() {
		System.out.println("This is test method");
		//test();//This is first form of recursion ie calling same method from its body.We need to control it for controlling this we take a static global 
		//variable to make it common because if we take that variable in method block then it will be local variable of method and it will re assigned again
		
	}

}
