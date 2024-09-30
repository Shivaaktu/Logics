package com.shiva.spider.Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryArray {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter any number");
		int n=sc.nextInt();
		int[] ans=new int[n+1];
		System.out.println("Array before operaton is "+Arrays.toString(ans));
		ans=binaryBits(ans);
		System.out.println("Array after operaton is "+Arrays.toString(ans));	

	}
	
	public static int[] binaryBits(int[] ans){
		ans[0]=0;
		int len=ans.length;
		for(int i=1;i<len;i++) {
			ans[i]=getSetBits(i);
		}
		return ans;
	}
	
	public static int getSetBits(int n) {
		int count=0;
		while(n>0) {
			if(n%2==1)
				count++;
			n=n/2;
		}
		return count;
	}
	

}
