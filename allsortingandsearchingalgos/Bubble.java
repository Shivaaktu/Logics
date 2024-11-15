package allsortingandsearchingalgos;

import java.util.Arrays;

public class Bubble {
	public static void main(String[] args) {
		int[] ar= {23,36,25,7435,0,453,6474,536,4};
		int[] arr= ar;
		System.out.println("before sorting ar array is "+Arrays.toString(ar));
		System.out.println("before sorting arr array is "+Arrays.toString(arr));

		bubbleSort(arr);
		System.out.println("after sorting ar array is "+Arrays.toString(ar));
		System.out.println("after sorting arr array is "+Arrays.toString(arr));
		ar[2]=-2;
		arr[3]=-3;
		System.out.println("after sorting ar array is "+Arrays.toString(ar));
		System.out.println("after sorting arr array is "+Arrays.toString(arr));
	
		
		
	}
	public static int[] bubbleSort(int[] arr) {
		int len=arr.length;
		for(int i=0;i<len;i++) {
			boolean already_sorted=true;
			for(int j=0;j<len-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					already_sorted=false;
				}
			}
			if(already_sorted)
				return arr;
		}
		return arr;
	}
	
	
}




