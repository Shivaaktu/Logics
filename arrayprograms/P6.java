package arrayprograms;

import java.util.Arrays;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {34,6,45,45,7,8,854,6,36,35,35,5,335};
		System.out.println("before "+Arrays.toString(arr));
		arr=removeDuplicate(arr);
		System.out.println("after "+Arrays.toString(arr));

	}
	public static int[] removeDuplicate(int[] arr) {
		int len=arr.length;
		int duplicate_count=0;
		for(int i=0;i<len;i++) {
			int e=arr[i];
			for(int j=i+1;j<len;j++) {
				if(arr[j]==e) {
					duplicate_count++;
					arr[j]=arr[len-1];
					j--;
					len--;
				}
			}
		}
		int[] arn=new int[arr.length-duplicate_count];
		for(int i=0;i<arn.length;i++) {
			arn[i]=arr[i];
		}
		arr=arn;
		return arn;
	}

}
