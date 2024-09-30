package com.shiva.spider.numberbsedprogram;

import java.util.Arrays;
import java.util.Scanner;

public class BitsArray{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		int[] ans=new int[n+1];
		ans=getBitsArray(ans);
		System.out.println(Arrays.toString(ans));

	}
	
	public static int[] getBitsArray(int ans[]){
		ans[0]=0;
		for(int i=1;i<=ans.length-1;i++){
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
