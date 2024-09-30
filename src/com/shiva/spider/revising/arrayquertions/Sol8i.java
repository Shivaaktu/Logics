package com.shiva.spider.revising.arrayquertions;

import java.util.Arrays;

public class Sol8i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,1,1,1,0,0,0,1,1,0,0,2,2,1,0,2,1};
		System.out.println("Before operation "+Arrays.toString(arr));
		arr=dutchNationalFlag(arr);
		System.out.println("After operation "+Arrays.toString(arr));

	}
	
	public static int[] dutchNationalFlag(int[] arr) {
		int c0=0, c1=0, c2=0;
		for(int k:arr) {
			if(k==0)
				c0++;
			else if(k==1)
				c1++;
			else
				c2++;
		}
		for(int i=0;i<c0;i++)
			arr[i]=0;
		
		for(int i=c0;i<c1+c0;i++)
			arr[i]=1;
		for(int i=c1+c0;i<arr.length;i++)
			arr[i]=2;
		System.out.println(c0+" "+c1+" "+c2);
		return arr;
		
	}
	

}
