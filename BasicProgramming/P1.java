package BasicProgramming;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getBig(60,40));

	}
	
	public static int getBig(int x,int y) {
		return (x>y)?x:y;
	}
	
	public static int getBig3(int x, int y, int z) {
		return (x>y)?((x>z)?x:z):((y>z)?y:z);
	}
	
	public static int getBig4(int a, int b, int c, int d) {
		int big=a;
		
		if(a>b&&a>c&&a>d)
			big= a;
		else if(b>c&&b>d)
			big=b;
		else if(c>d)
			big=c;
		else
			big=d;
		
		return big;
		
	}
	
	public static boolean isAlphabate(char c) {
		if((c>64&&c<91)||(c>96&&c<123))
			return true;
		return false;
	}
	
	public static boolean checkDiv(int x) {
		if((x%5==0)&&x%11==0)
			return  true;
		return false;
		
	}

}
