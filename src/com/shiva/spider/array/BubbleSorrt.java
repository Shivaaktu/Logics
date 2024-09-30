package com.shiva.spider.array;

import java.util.Arrays;

public class BubbleSorrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,4,5,8,0,98,56,64,8,60,3,3,46,48,-3,7,-546,368,-56,46};
		System.out.println("Array before sort is "+Arrays.toString(arr));
		
		sortArray(arr);
		
		System.out.println("Array after sort is "+Arrays.toString(arr));

		
	}
	
	public static int[] sortArray(int[] arr) {
		int len=arr.length;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

}
