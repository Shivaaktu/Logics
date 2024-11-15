package arrayprograms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,363,47,87,20,15,8,5,9,6,9,68,30,16,91,70,36,99,-444,6444,477,57,4,64,49};
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
//	public static int[] selectinSort(int[] arr) {
//		int len=arr.length;
//		for(int i=0;i<len-1;i++) {
//			int min=arr[i];
//			int min_index=i;
//			for(int j=i+1;j<len;j++) {
//				if(arr[j]<min) {
//					min=arr[j];
//					min_index=j;
//				}
//			}
//			arr[min_index]=arr[i];
//			arr[i]=min;
//		}
//		return arr;
//	}
	
	public static int[] selectionSort(int[] arr) {
		int len=arr.length;
		for(int i=0;i<len;i++){
			int min_index=i;
			for(int j=i+1;j<len;j++) {
				if(arr[j]<arr[min_index]) {
					min_index=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
		}
		return arr;
	}

}
