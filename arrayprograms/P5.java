package arrayprograms;

import java.util.Arrays;

//reverse array;
public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int[] arr= {10,20,30,40,50,60};
		System.out.println("before sorintg "+Arrays.toString(arr));
		reverseArray(arr);
		System.out.println("after sorintg "+Arrays.toString(arr));

	}
	
	public static void reverseArray(int[] arr) {
		int len=arr.length;
		for(int i=0;i<len/2;i++) {
			arr[i]=        arr[i]^arr[(len-1)-i];
			arr[(len-1)-i]=arr[i]^arr[(len-1)-i];
			arr[i]=        arr[i]^arr[(len-1)-i];
		}
	}

}
