package com.shiva.spider.revising.arrayquertions;

import java.util.Arrays;
import java.util.Scanner;

public class Sol5 {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,2,54,65,0,65,56,-89,45,2,554,34,53,6,6,3,5,534,5,35,343};
		System.out.println("Arry before delecte "+Arrays.toString(arr));
		arr=deleteArray(arr);
		System.out.println("Array after deleting "+Arrays.toString(arr));
	}
	
	public static int[] deleteArray(int[] arr){
		System.out.println("Enter the number no to delete");
		int num=sc.nextInt();
		int[] arn=new int[arr.length-1];
		boolean valuenotfound=true;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=num&&valuenotfound) {
				try {
					arn[i]=arr[i];
				}catch(Exception e) {
					System.out.println("No such element found in the array ");
					return arr;
				}
			}
			else if(arr[i]==num)
				valuenotfound=false;
			else
				arn[i-1]=arr[i];	
		}
		return arn;
	}

}
