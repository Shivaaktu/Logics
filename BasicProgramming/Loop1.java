package BasicProgramming;

public class Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println(getFeb(i));
		}
	}
	
	private static int getFeb(int x) {
		if(x<2)
			return x;
		return getFeb(x-1)+getFeb(x-2);
	}

	private static int getFactorial(int x) {
		int fact=1;
		for(int i=1;i<=x;i++) {
			fact=fact*i;
		}
		return fact;
	}

	private static byte countDigits(int x) {
		byte count=0;
		while(x>0) {
			count++;
			x=x/10;
		}
		return count;
	}
	private static boolean m5(int x) {
		// TODO Auto-generated method stub
		if(x<4)
			return true;
		for(int  i=2;i<=Math.sqrt(x);i++) {
			if(x%i==0)
				return false;
		}
		return true;	
	}

	private static void m4(int x) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=2;i<=Math.sqrt(x);i++) {
			if(x%i==0)
				count++;
		}
		System.out.println(count);	
	}

	private static void m3(){
		int count=0;
		for(int i=7;i<=500;i++){
			if(i%7==0&&i%10==7)
				count++;
		}
		System.out.println(count);	
	}

	private static void m2() {
		for(int i=8;i<=200;i++) {
			if(i%8==0)
				System.out.println(i);
		}
	}

	public static void m1() {
		for(int i=2;i<=100;i++) {
			if(i%2==0)
			System.out.println(i);
		}
	}
}
