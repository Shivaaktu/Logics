package com.shiva.spider.revising.arrayquertions;


public class Qu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1= {4,44,5,96,7,18,57,36,43,6857};
		String[] ar2= {"ete","ertyeyye","y64rtt","ee6y5y","r6yregr"};
		rintArray(ar1);
	}
	
	
	public static void rintArray(int[] arr){
		for(int i=arr.length-1;i>=arr.length/2;i--) {
			System.out.println(arr[i]);
		}
	}
	
	
	public static int checkString(String[] arr){
		int count=0;
		for(String s:arr) {
			if(s.length()%2==0) {
				System.out.println(s+" is a even length string");
				count++;  
			}  
		}
		System.out.println("Total even stings in the array are "+count);
		return count;	
	}
	
	public static void avg(int[]arr){
		int sum=0;
		for(int k:arr)
			sum=sum+k;
		double avg=sum/arr.length;
		System.out.println("Sum is "+sum+" average is "+avg);
	}
	
	public static void getBigSmall(int[] arr) {
		int big=-3245656;
		int small=234456;
		
		for(int k:arr) {
			if(k>big)
				big=k;
			if(k<small)
				small=k;
		}
		System.out.println("The biggent element is "+big+" the smallest element is "+small+" and diffrence is "+(big-small));
	}
	
	public static int printEven(int[] arr){
		int count=0;
		for(int k:arr){
			if(k>99){
				System.out.println(k+" is a 3 digit number");
				count++;
			}
		}
		System.out.println("Total 3 digit numbers in array are "+count);
		return count;
	}
	
	

}
