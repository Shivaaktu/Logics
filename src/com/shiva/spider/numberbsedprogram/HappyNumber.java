package com.shiva.spider.numberbsedprogram;
//wapj to check a number is happy number of not. To check a number is Happy calculate sum of square of all digits and again perform 
// 
import java.io.IOException;
public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=9000;i++) {
			if(checkHappy(i))
			System.out.println(i+" is a happy number.");
		}
	}
	
	public static boolean checkHappy(int x){
		while(x>9){
			int sum=0;
			while(x>9) {
				int rem=x%10;
				sum=sum+rem*rem;
			x=x/10;	
			}
			sum=x;
		}
		return x==1||x==7;
	}
	

}
