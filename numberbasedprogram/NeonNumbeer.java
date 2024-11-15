package numberbasedprogram;

public class NeonNumbeer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isNeon(25));

	}
	
	public static boolean isNeon(int n) {
		int sqr=n*n;
		int sum=0;
		while(sqr>0) {
			sum+=sqr%10;
			sqr/=10;
		}
		return n==sum;
	}
}
