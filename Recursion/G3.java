package Recursion;

import java.text.DecimalFormat;

public class G3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stud
		int[] arr= {34,34,36,4647,46,58,6,475,8,7,46,987};
		System.out.println("Element "+4647+" is presenet at "+findElementIndex(arr,arr.length,4647));

	}
	public static int sumArray(int[] arr, int len) {
		if(len==1) {
			return arr[len-1];
		}
		return (arr[len-1]+sumArray(arr,len-1))  ;
	}
	public static float getAvrage(int[] arr, int len) {
		double sum=sumArray(arr,len)+.00001;
		return (float)((sum+.0001)/len);
		
	}
	public static int findBigInArray(int[] arr, int len) {
		if(len>1) {
			int big=findBigInArray(arr,len-1);
			return arr[len-1]>big?arr[len-1]:big;
		}
		return arr[len-1];
	}
	public static int findElementIndex(int[] arr, int len, int element) {
		if(len<2) {
			if(arr[len-1]==element)
				return len-1;
				else
					return -1;
		}
		if(arr[len-1]==element)
			return len-1;
		else
			return findElementIndex(arr,len-1,element);
	}
}
