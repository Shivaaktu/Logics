package com.shiva.spider.revising.arrayquertions;

public class Sol3i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {234,5678,7,-34,87,0,5,53,76,-35,890,8,9,70,78,26,75,6,464};
		checkArray(arr);
	}
	
	public static boolean checkArray(int[] arr) {
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]){
					System.out.println("This array haverepeted elenet "+arr[i]+" ans inde is "+i);
					return false;
				}
			}
		}
		System.out.println("Thsi arrray nave all unique eeklents");
		return true;
	}

}
