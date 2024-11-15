package numberbasedProgram63;

import java.util.Scanner;
public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range");
		int x=sc.nextInt();
		System.out.println(mainFunction(x));

	}
	
	public static int mainFunction(int x) {
		int count=0;
		for(int i=2;i<=x;i++) {
			if(numPrimeAndDigitSumPrime(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.print("And total such nuumber are>");
		return count;
	}
	
	public static boolean numPrimeAndDigitSumPrime(int x) {
		int temp=x;
		int sum=0;
		while(x>0) {
			sum+=x%10;
			x/=10;
		}
		return (checkPrime(temp)&&checkPrime(sum));
	}
	
	public static boolean checkPrime(int x) {
		for(int i=2;i<=Math.sqrt(x);i++) {
			if(x%i==0)
				return false;
		}
		return true;
	}

}
