package com.shiva.spider.array;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {63,61,46,48,54,9,5,9,6,84,61,75,61,9,8,61,47,61,4,61,89,61,58,7,61,61,59,6,84,7,5,9,68,};
		countAppear(arr);
	}
	
	public static void countAppear(int[] arr){
		int max=0;
		int[] arfr= new int[101];
		for(int k:arr) {
			arfr[k]++;
		}
		
		for(int i=0;i<arfr.length;i++){
			if(arfr[i]>0)
			System.out.println(i+" appears "+arfr[i]+" times");
		}
		for(int j=0;j<arfr.length;j++) {
			if(arfr[j]>max)
				max=j;
			if(arfr[j]==1)
				System.out.println(j+" appears "+arfr[j]+" times ie only one time");
			else if(arfr[j]!=0)
				System.out.println(j+" appears "+arfr[j]+" times ie more then one time");
		}
		System.out.println(max+" appears maximum times in array");
	}

}
