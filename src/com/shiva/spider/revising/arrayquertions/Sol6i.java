package com.shiva.spider.revising.arrayquertions;

import java.util.Arrays;

public class Sol6i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,3,0,0,0,4,0,0,4,0,5,0,6,0};
		System.out.println("Before operation "+Arrays.toString(arr));
		arr=all0sonLeft(arr);
		System.out.println("After operation "+Arrays.toString(arr));

		
	}
	public static int[] all0sonLeft(int[] arr) {
		int len=arr.length;
		for(int i=0;i<len;i++){
			if(arr[i]==0){
				arr[i]=arr[len-1];
				arr[len-1]=0;
				len--;
				i--;
			}
		}
		return arr;
	}

}
