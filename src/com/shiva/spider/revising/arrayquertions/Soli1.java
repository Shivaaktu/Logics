package com.shiva.spider.revising.arrayquertions;

import java.util.Arrays;

public class Soli1 {

	private static int lenght;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {82,36,40,80,50,60};
		System.out.println("Before operation "+Arrays.toString(arr));
		arr=cyclicRotate2(arr);
		System.out.println("After operation "+Arrays.toString(arr));


	}
	
//	public static int[] cyclicRotate(int[] arr) {
//		int[] ar2=new int[arr.length];
//		for(int i=0;i<arr.length-1;i++) {
//			ar2[i+1]=arr[i];
//		}
//		ar2[0]=arr[arr.length-1];
//		return ar2;
//	}
	
	public static int[] cyclicRotate2(int[] arr) {
		int temp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		return arr;
	}
}
