package com.shiva.spider.programbyownchoice;

import java.util.Scanner;

//Q- Given an array of size n and you have to find maximum number of consecutive 1s in this array ? 
public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,0,1,0,0,0,0,1,1,1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,1,1,0,0,0,1,0,1,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1
				,1,1,1,0,1,0,0,0,0,0,1,0,0,1,1,1,0,1,0,0};
		int max=consicutive1s(arr);
		System.out.println("Max cons are "+max);
	 }
	
	public static int consicutive1s(int[] arr) {
		int max1=0;
		int max2=0;
		int max3=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==1) {
				max1++;
				continue;
			}
			else if(arr[i]!=1){
				if(max3<max2||max3==max2)
				max3=max2;
				max2=max1;
				max1=0;
			}
			
		}
		return findMax(max1, max2, max3);
	}
	
	public static int findMax(int a, int b, int c) {
		int big=(a>b)?a:b;
		big=(big>c)?big:c;
		
		return big;
	}

}
