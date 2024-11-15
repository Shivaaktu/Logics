package arrayprograms;
//check that an array is palindrome ie have same corresponding element at front and back;
public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,6,5,4,3,2,1};
		System.out.println(isPalindromArray(arr));
	}
	
	public static boolean isPalindromArray(int[] arr) {
		int len=arr.length;
		for(int i=0;i<len/2;i++) {
			if(arr[i]!=(arr[len-1-i]))
				return false;	
		}
		return true;
	}

}
