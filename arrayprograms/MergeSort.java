package arrayprograms;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {48,12,24,36,700,90,-45,474,0,464,0,46464,-34453,035353};
		System.out.println("Array before sorting is "+Arrays.toString(arr));
		divide(arr,0,arr.length-1);
		System.out.println("Array after sorting is "+Arrays.toString(arr));
	}
	
	
	public static void divide(int[] arr, int si, int ei) {
		if(ei>si) {
			int mid=si+(ei-si)/2;
			divide(arr, si, mid);
			divide(arr,(mid+1),ei);
			conquer(arr, si, mid, ei);
		}
	}
	private static void conquer(int[] arr, int si, int mid, int ei) {
		int[] temp=new int[ei-si+1];
		int index1=si;
		int index2=mid+1;
		int x=0;
		
		while(index1<=mid&&index2<=ei) {
			if(arr[index1]<arr[index2])
				temp[x++]=arr[index1++];
			else
				temp[x++]=arr[index2++];	
		}
		
		while(index1<=mid)
			temp[x++]=arr[index1++];
		while(index2<=ei)
			temp[x++]=arr[index2++];
		System.out.println("no prigelaa");
		for(int i=0, j=si; i<temp.length;i++,j++)
			arr[j]=temp[i];
		
	}
}
