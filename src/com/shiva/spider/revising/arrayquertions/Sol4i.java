package com.shiva.spider.revising.arrayquertions;

public class Sol4i {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int[] arr= {12,15,23,23,15,12};
		checkPelindromArray(arr);
	}
	
	public static boolean checkPelindromArray(int[] arr) {
		int len=arr.length-1;
		for(int i=0;i<arr.length/2;i++) {
			if(arr[i]!=arr[len-i]) {
				System.out.println("Not a palindrom sting ");
				return false;
			}
		}
		System.out.println("Yes it is a palindrom array");
		return true;
	}

}
