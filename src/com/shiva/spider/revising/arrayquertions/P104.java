package com.shiva.spider.revising.arrayquertions;

import java.util.Arrays;

public class P104 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int[] ar1= {23,5,46,65,7,0,68,0,56,9-45,7-9,5,7657};
		System.out.println(Arrays.toString(ar1));
		int[] ar2=sortArray(ar1);
		System.out.println(Arrays.toString(ar2));

		
	}
	
	public static int[] sortArray(int[] arr) {
		int len=arr.length;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}

}
