package numberbasedprogram;
//A number which has sum of factorial of all its individual digits equal to number itself.
public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strongNumber(146));
	}
	
	public static boolean strongNumber(int x) {
		int sum=0;
		int temp=x;
		while(x>0) {
			sum+=getFactorial(x%10);
			x/=10;
		}
		return sum==temp;
	}
	
	public static int getFactorial(int x) {
		if(x<2) {
			return x;
		}
		return x*getFactorial(x-1);
	}

}
