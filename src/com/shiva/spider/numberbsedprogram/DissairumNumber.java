package com.shiva.spider.numberbsedprogram;
//wajp to chek the numnbe is disairum or not. Disairum numer is a type of number as follows first count the digits in the nubmer
//and then get power of every digit according to its position and then add all these powers and now if the sum of powers is itself the 
// number then it is a disairum number. ex n=154 it has three digts now power as 1power1+5power2+4power3 if the sum==154 then true.
public class DissairumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=678;i++)
		System.out.println(checkDisairum(i));

	}
	
	public static boolean checkDisairum(int x)
	{ 
		int temp=x;
		int digit_count=countDigit(x);
		int sum=0;
		while(x>0){
			sum=sum+(int)Math.pow((x%10),digit_count);
			digit_count--;
			x=x/10;
		}
		System.out.println(sum);
		return sum==temp;
		
	}
	
	public static int countDigit(int x) {
		int count=0;
		while(x>0){
			count++;
			x=x/10;
		}
		return count;
	}

}
