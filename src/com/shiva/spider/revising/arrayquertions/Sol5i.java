package com.shiva.spider.revising.arrayquertions;

public class Sol5i {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int[] arr= {5,4,4,2,1,7,5,1,1,5};
		findOddFrequency(arr);

	}
	
	public static void findOddFrequency(int[] arr){
		int len=arr.length;
		for(int i=0;i<len;i++){
			int count=1;
			for(int j=i+1;j<len;j++) {
				if(arr[i]==arr[j]){
					count++;
					arr[j]=arr[len-1];
					len--;
					j--;
				}
			}
			if(count%2!=0) {
				System.out.println(arr[i]+" has odd count "+count);
			}
		}
		
	}

}
