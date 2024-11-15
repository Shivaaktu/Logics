package arrayprograms;

import java.util.Arrays;
//to move all zeros on right side of arry
public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,2,3,0,5,6,60,7,0,7,0,7,0};
		System.out.println("before "+Arrays.toString(arr));
		moveZero(arr);
		System.out.println("after "+Arrays.toString(arr));


	}
	
	public static void moveZero(int[] arr) {
		int len=arr.length;
		for(int i=0;i<len;i++) {
			if(arr[i]==0) {
				arr[i]=arr[len-1];
				arr[len-1]=0;
				len--;
				i--;
			}
		}
	}

}
