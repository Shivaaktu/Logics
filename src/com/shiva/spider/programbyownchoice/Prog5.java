package com.shiva.spider.programbyownchoice;
//write a java program to get the maximum number of continuous 1s in any given array.
import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={0,1,0,1,0,0,0,0,1,1,1,1,1,0,1,1,1,1,1,1,9,0,1,1,1,1,1,0,0,0,1,0,1,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1
				,1,1,1,0,1,0,0,0,0,0,1,0,0,1,1,1,0,1,0,0};
		int max=findMaxContSeries(arr, 9);
		System.out.println(max);
	}
	
	public static int findMaxContSeries(int[] arr, int x) {
		int current_max_count=0, max_count=0, len=arr.length;
		
		for(int i=0;i<len;i++) {
			if(arr[i]==x)
				current_max_count++;
			else {
				if(current_max_count>max_count)
					max_count=current_max_count;
				current_max_count=0;
			}
		}
		return (current_max_count>=max_count)?current_max_count:max_count;
	}

}
