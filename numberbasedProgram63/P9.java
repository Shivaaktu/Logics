package numberbasedProgram63;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(shiftEvenOdd(253687));

	}
	
	public static int shiftEvenOdd(int x) {
		int res=0;
		int mul=10;
		while(x>0) {
			int rem=x%10;
			if(rem%2==0)
				res=res*mul+rem;
			else
				res=res*mul+rem;
			x/=10;
		}
		return res;
	}

}
