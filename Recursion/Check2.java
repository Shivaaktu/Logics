package Recursion;

public class Check2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	printAscSecond(100);

	}
	public static void printAsc(int n) {
		if(n>1) {
			printAsc(n-1);
			System.out.print(n+" ");
		}
		else {
		System.out.print(n+" ");
		}
	}
	
	public static void printDesc(int n) {
		if(n>1) {
			System.out.print(n+" ");
			printDesc(n-1);
		}else
			System.out.print(n+" ");
	}
	
	public static void printAscSecond(int n) {
		if(n>1)
			printAscSecond(n-1);
		System.out.println(n);
	}
	
	public static void printDescSecond(int n) {
		System.out.println(n+" ");
		if(n>1)
			printDescSecond(n-1);
	}

	
}
