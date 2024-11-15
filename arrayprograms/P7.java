package arrayprograms;

import java.util.Arrays;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int[] arr= {11,3,2,4,5,6,7,8,9,101,10,12};
		System.out.println("before "+Arrays.toString(arr));
		sortAscDesc(arr);
		System.out.println("after "+Arrays.toString(arr));
	}
	
	public static void sortAscDesc(int[] arr) {
		int len=arr.length;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len/2-1;j++) {
				if(arr[j]>arr[j+1]) {
					arr[j]=arr[j]^arr[j+1];
					arr[j+1]=arr[j]^arr[j+1];
					arr[j]=arr[j]^arr[j+1];
				}
			}
			for(int j=len/2;j<len-1;j++) {
				if(arr[j]<arr[j+1]) {
					arr[j]=arr[j]^arr[j+1];
					arr[j+1]=arr[j]^arr[j+1];
					arr[j]=arr[j]^arr[j+1];
				}
			}
		}
		
	}
}
