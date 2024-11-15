package Recursion;
import java.util.Scanner;
public class Check4 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter how many numbers you want to chaek");
		int temp=sc.nextInt();
		// TODO Auto-generated method stub
		System.out.println("Biggest element is "+findBig(temp));
	}
	
	public static int findBig(int n) {
		if(n==2) {
		System.out.println("Enter element no "+(n-1));
		int a=sc.nextInt();
		System.out.println("Enter element no "+n);
		int b=sc.nextInt();
		return a>b?a:b;
		}
		int a=findBig(n-1);
		System.out.println("Enter element no "+n);
		int b=sc.nextInt();
		return a>b?a:b;	
	}

}
