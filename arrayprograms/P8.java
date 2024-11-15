package arrayprograms;

import java.util.Arrays;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,4,5,6,7,8};
		System.out.println("before "+Arrays.toString(arr));
		rotateArray(arr);
		System.out.println("after "+Arrays.toString(arr));

	}
	
	public static void rotateArray(int[] arr) {
		int len=arr.length;
		int temp=arr[len-1];
		for(int i=len-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
	}

}
