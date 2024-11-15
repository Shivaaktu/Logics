package arrayprograms;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,5,6,6,8,9,0,40};
		System.out.println(hasAllUnique(arr));
	}
	
	public static boolean hasAllUnique(int[] arr) {
		int len=arr.length;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i]==arr[j])
					return false;	
			}
		}
		return true;
	}
}
