package Recursion;
import java.util.Scanner;

public class Check3 {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSum(3)+" is sum");
	}
	
	public static int getSum(int n) {
		if(n<1)
			return 0;
		getSum(n-1);
		System.out.println("Enter element at "+n);
		int a=sc.nextInt();
		return a+getSum(n-1);
			
	}

}
