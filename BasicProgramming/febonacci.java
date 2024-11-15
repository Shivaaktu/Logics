package BasicProgramming;

import java.util.Arrays;

public class febonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Arrays.toString(printFeba(19)));

	}
						//6
//	static int printFeb(int x) {
//		int feb1=0;//1
//		int feb2=1;//
//		int febn=0;//1
//		if(x<2)//
//			return x;
////					3<=6
//		for(int i=2;i<=x;i++) {
//			febn=feb1+feb2;
//			feb1=feb2;
//			feb2=febn;
//		}
//		return febn;
//	}

	private static int[] printFeba(int x) {
		int[] arr=new int[x+1];
		
		for(int i=1;i<=x;i++){
			arr[i]=printFeb(i);
		}
		
		return arr;
		
	}

	private static int printFeb(int x) {
		if(x<2)
			return x;
		return printFeb(x-1)+printFeb(x-2);
	}
	
	

}
