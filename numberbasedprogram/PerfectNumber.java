package numberbasedprogram;
//A perfect number is a number which has sum of all its factor equal or same as the number itself. stating from 1 as first factor
//and number itself not included as a factor.
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPerfect(29));

	}
	
	public static boolean isPerfect(int x) {
		int factor_sum=0;
		for(int i=1;i<=x/2;i++) {
			if(x%i==0)
				factor_sum+=i;
		}
		return x==factor_sum;
	}

}
