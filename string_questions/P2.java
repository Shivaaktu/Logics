package string_questions;
//check palindrome
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPalindrome("Rohanahor"));

	}
	
	public static boolean checkPalindrome(String s1) {
		s1=s1.toLowerCase();
		int len=s1.length();
		for(int i=0;i<len/2;i++) {
			if(s1.charAt(i)!=s1.charAt(len-1-i))
					return false;
		}
		return true;
	}
	

}
