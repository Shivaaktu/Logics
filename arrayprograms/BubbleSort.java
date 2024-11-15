package arrayprograms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {75,86,9,07,8,-57,6,9,9988757,6,8,-75,75,79,-5757,-988,8,4441,5,37,58,57,85};
		System.out.println("Array before sort "+Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("Array after sort "+Arrays.toString(arr));
		

	}

	public static int[] bubbleSort(int[] arr) {
		int len=arr.length;
		for(int i=0;i<len-1;i++) {
			boolean already_sorted=true;
			for(int j=0;j<len-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					already_sorted=false;
					arr[j]=arr[j]^arr[j+1];
					arr[j+1]=arr[j]^arr[j+1];
					arr[j]=arr[j]^arr[j+1];
				}
			}
			if(already_sorted)
				return arr;
		}
		return arr;
	}

}
