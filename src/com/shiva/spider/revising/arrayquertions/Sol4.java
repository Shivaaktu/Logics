package com.shiva.spider.revising.arrayquertions;

import java.util.Arrays;
import java.util.Scanner;

public class Sol4 {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int[] arr= {3,2,54,65,0,65,56,-89,45,2,554,34,53,6,6,3,5,534,5,35,343};
		System.out.println("Arry before insring is "+(Arrays.toString(arr)));
		int x=sc.nextInt();
		int y=sc.nextInt();
		arr[y]=x;
		System.out.println("Arry agter insring is "+(Arrays.toString(arr)));

	}

	public static int[] insetIntoArray(int [] arr){
		System.out.println("Enter the numer to insert");
		int x=sc.nextInt();
		System.out.println("Enter indexno to enter upto "+arr.length);
		int index=sc.nextInt();
		int[] arn=new int[arr.length+1];
		for(int i=0;i<arr.length;i++){
			if(i<index)
				arn[i]=arr[i];
			else if(i==index){
				arn[i]=x;
			}
			else{
				arn[i+1]=arr[i];
			}
			
		}
		return arn;
	}
}
