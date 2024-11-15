package Recursion;

public class G1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print2(100);

	}
	public static void print1(int n) {
		if(n==1) {
			System.out.println(n);
			return;
		}
		print1(n-1);
		System.out.println(n);	
	}
	
	public static void print2(int n) {
		if(n==1) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		print2(n-1);
	}

}
