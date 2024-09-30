package com.shiva.spider.revising.arrayquertions;

public class Prog7i {
	public static void main(String[] args) {
		int[] arr= {12,33,44,55,66,77,808,98,109,349};
		checkStrictlyIncreasing(arr);
	}
	
	public static boolean checkStrictlyIncreasing(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>=arr[i+1]) {
				System.out.println("This array is not stinctly increaring"+" at index no "+i+" and "+arr[i]);
				return false;
			}	
		}
		System.out.println("This array is stinctly increaring");
		return true;
	}
}
