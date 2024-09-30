package com.shiva.spider.revising.arrayquertions.Instagram.tupe2;

public class Sol11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {225,63,225,25,2,64,75,-34,43,5,36,35,25,52,52};
		printFrequency(arr);
	}
	
	public static void printFrequency(int[] arr) {
		int itr=0;
		int len=arr.length;
		for(int i=0;i<len;i++) {
			int count=1;
			for(int j=i+1;j<len;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=arr[len-i-1];
					j--;
					len--;
				}
				
				itr++;
			}
			System.out.println(arr[i]+" appears "+count+" times");
		}
		
		System.out.println("Total iterarions are "+itr);
	}

}
