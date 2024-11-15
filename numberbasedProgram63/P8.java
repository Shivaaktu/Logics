package numberbasedProgram63;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(shift0and1(10101010));

	}
	
	public static int shift0and1(int x) {
		int c0=0;
		int res=0;
		while(x>0) {
			if(x%2==1)
				res=res*10+1;
			else
				c0++;
			x/=10;
		}
		while(c0>0) {
			res*=10;
			c0--;
		}
		return res;
	}

}
