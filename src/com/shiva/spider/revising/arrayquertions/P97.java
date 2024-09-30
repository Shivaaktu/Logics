package com.shiva.spider.revising.arrayquertions;

import java.util.Arrays;

public class P97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1= {23,5,46,65,7,0,68,0,56,9-45,7-9,5};
		int[] ar2=new int[ar1.length];
		System.out.println(Arrays.toString(ar1));
		int len=ar1.length;
		for(int i=0;i<len;i++)
			ar2[i]=ar1[len-i-1];
		System.out.println(Arrays.toString(ar2));
		
		ar1[2]=678;
		ar2[7]=12345;
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));

	}

}
