package Recursion;

public class Check1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printFactorial(5));	
	}
	
	public static int getSum(int n) {
		if(n<=1)
			return 1;
		return n+getSum(n-1);
	}
	public static int getFactorial(int n) {
		if(n<=1)
			return 1;
		return n*getFactorial(n-1);
		
	}
	public static int getPower(int base, int exp) {
		if(exp==1)
			return base;
		return base*getPower(base, exp-1);
	}
	
	
	public static int getSelfSum(int n) {
		int sum=0;
		if(n<10) {
			sum+=n;
			return sum;
		}
		sum+=n%10;
		return sum+getSelfSum(n/10);
	}
	
	public static byte countDigits(int n) {
		byte count=0;
		if(n<10)
			return ++count;
		return (byte)(++count+countDigits(n/10));	
	}
	
	public static int printFactorial(int n) {
		if(n==1) {	
			System.out.println("factorial of 1 is "+n);
			return 1;
		}
		int fact=n*printFactorial(n-1);
		System.out.println("Factorial of "+n+" is "+fact);
		return fact;
	}

}
