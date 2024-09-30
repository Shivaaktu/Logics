package com.shiva.spider.revising.arrayquertions;

public class P90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {31,2,3,54,15,6,7,8,99};
		printEvenIndex(arr);

	}
	
	public static int printEvenIndex(int[] arr) {
		int max=-3245687;
		for(int i=1;i<arr.length;i+=2) {
			if(arr[i]>max)
				max=arr[i];
			
		}
		System.out.println("maximum num is "+max);
		return max;
	}

}
