package BasicProgramming;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getPowerb(10,1));
		System.out.println(5^3);

	}
	
	private static int getPowerb(int base, int exp) {
		return base^exp;
	}

	public static int getPower(int base, int exp){
		if(exp==0||base==1)
			return 1;
		if(base==0)
			return 0;
		int power=base;
		while(exp>1) {
			power=power*base;
			exp--;
		}
		return power;		
	}
	
	

}
