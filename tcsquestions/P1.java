package tcsquestions;

import java.util.Scanner;
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter n1");
		int n1=sc.nextInt();
		System.out.println("Enter n2");
		int n2=sc.nextInt();
		
		int count=0;
		for(int i=n1;i<=n2;i++) {
			if(notHaveRepeatedDigits(i))
				count++;
		}
		System.out.println("Total such number in range with no repeated digits are "+count);
	}
	
	public static boolean notHaveRepeatedDigits(int x) {
		int temp=x;
		while(x>0) {
			int rem=x%10;
			x=x/10;
			temp=temp/10;
			while(x>0) {
				if(x%10==rem)
					return false;
				x=x/10;
			}
			x=temp;
		}
		return true;
	}
}
