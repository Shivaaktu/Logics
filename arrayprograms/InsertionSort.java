package arrayprograms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {22,3,7,8,8,-3653,470,5,7,9,6,-7,577};
		System.out.println("Before "+Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("After "+Arrays.toString(arr));
	}
	
//	public static int[] insertionSort(int[] arr) {
//		int  len=arr.length;
//		for(int i=0;i<len;i++) {
//			int key=arr[i];
//			int j=i-1;
//			while(j>=0&&arr[j]>key) {
//				arr[j+1]=arr[j];
//				j--;
//			}
//			arr[j+1]=key;
//		}
//		return arr;
//	}
	
	public static int[] insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		return arr;
	}
}
