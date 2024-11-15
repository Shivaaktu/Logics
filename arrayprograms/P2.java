package arrayprograms;
//count how many times an element present in an array
import java.util.Scanner;
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,2,0,3,63,0,8,9,-37,0,69,0,0,9,9,8,4,0};
		getCount(arr,0);
	}
	
	public static void getCount(int[] arr, int x) {
		int len=arr.length;
		int count=0;
		for(int i=0;i<len;i++){
			if(arr[i]==x) {
				count++;
				arr[count-1]=i;
			}
		}
		System.out.println(x+" comes "+count+" times in array ant indexes are below>>>>>>>>>");
		for(int i=0;i<count;i++) {
			System.out.print(arr[i]+",");
		}
	}

}
