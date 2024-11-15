package arrayprograms;

import java.util.Arrays;

//dutch national flag probleam
public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,0,0,2,2,1,0,2,1,0,2,1};
		dutchFlag(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void dutchFlag(int[] arr) {
		int len=arr.length;
		int cz=0, co=0, ct=0;
		
		for(int k:arr) {
			if(k==0)
				cz++;
			else if(k==1)
				co++;
			else
				ct++;
		}
		for(int i=0;i<len;i++) {
			if(cz>0) {
				arr[i]=0;
				cz--;
			}
			else if(co>0) {
				arr[i]=1;
				co--;
			}else {
				arr[i]=2;
				ct--;
			}
				
		}
		
	}

}
