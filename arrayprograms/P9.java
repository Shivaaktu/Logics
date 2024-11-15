package arrayprograms;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {56,25,3,64,75,8,86,5,0,6,9,-35,9,0,79,86};
		getMaxProduct(arr);
	}
	
	public static int getMaxProduct(int[] arr) {
		int big1=Integer.MIN_VALUE;
		int big2=Integer.MIN_VALUE;
		
		for(int k:arr) {
			if(k>big1) {
				big2=big1;
				big1=k;
			}
			else if(k>big2&&k<=big1) {
				big2=k;
			}
		}
		System.out.println(big1+" "+big2+"Product of two max values is "+(big1*big2));
		return big1*big2;
	}

}
