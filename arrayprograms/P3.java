package arrayprograms;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		int[] arr= {0,0,56,1,0,3,4,56,7,56,0,0};
		getBig(arr);
	}
	public static void getBig(int[] arr) {
		int big1=Integer.MIN_VALUE;
		int big2=Integer.MIN_VALUE;
		int big3=Integer.MIN_VALUE;
		for(int k:arr) {
			if(k>big1) {
				big3=big2;
				big2=big1;
				big1=k;
			}
			else if(k>big2&&k<=big1) {
				big3=big2;
				big2=k;
			}
			else if(k>big3&&k<=big2) {
				big3=k;
			}
		}
		System.out.println(big1+","+big2+","+big3);
	}

}
