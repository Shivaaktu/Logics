package arrayprograms;
import java.util.Arrays;
import java.util.Scanner;
public class P1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number to check its divisiblity ann by which nuumber");
		int n=sc.nextInt();
		int m=sc.nextInt();
		boolean[] arr=new boolean[m];
		arr[0]=true;
		System.out.println(arr[n%m]);
	}
}
		
	