package numberbasedprogram;

public class SpyNumber {

	public static void main(String[] args) {
		System.out.println("Strar");
		for(int i=0;i<=10000;i++) {
			if(isSpy(i))
			System.out.println(i);
		}
	}
	
	public static boolean isSpy(int x) {
		int sum=0;
		int mul=1;
		while(x>0) {
			int rem=x%10;
			sum+=rem;
			mul*=rem;
			x/=10;
		}
		return sum==mul;
	}

}
