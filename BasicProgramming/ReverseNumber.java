package BasicProgramming;


public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrom(1234421));

	}
	public static boolean isPalindrom(int x) {
		return x==reverseNum(x);
	}
	
	public static int reverseNum(int x) {
		int rev=0;
		while(x>0) {
			rev=rev*10+x%10;
			x/=10;
		}
		return rev;
	}
	
	public static String revString(String num) {
		String ans="";
		
		for(int i=0;i<num.length();i++) {
			ans=num.charAt(i)+ans;
		}
		return ans;
	}

}
