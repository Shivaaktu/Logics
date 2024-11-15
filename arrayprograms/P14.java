package arrayprograms;

//to check array is strinctly increasing
public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2};
		System.out.println(strictIncreas(arr));
	}
	public static boolean strictIncreas(int[] arr) {
		int j=1;
		while(j<arr.length) {
			if(arr[j-1]>=arr[j]) {
				return false;
			}
			j++;
		}
		return true;
	}
}
