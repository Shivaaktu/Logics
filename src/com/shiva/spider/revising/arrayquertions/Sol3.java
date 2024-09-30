package com.shiva.spider.revising.arrayquertions;
import java.util.Arrays;
import java.util.Scanner;
public class Sol3{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of arry");
		int x=sc.nextInt();
		int[] arr=new int[x];
		System.out.println("Array before insertion is "+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter int at indexno "+(i+1));
			arr[i]=sc.nextInt();
		}
		System.out.println("Array after insertion is "+Arrays.toString(arr));
	}

}
