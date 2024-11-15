package numberbasedProgram63;

public class P50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replace0(41022005));

	}
	
	
	public static int replace0(int x) {
		int ten_mul=1;
		int res=0;
		while(x>0) {
			int rem=x%10;
			if(rem!=0) {
				res+=ten_mul*rem;
			}
			else {
				rem=1;
				res+=ten_mul*rem;
			}
			ten_mul*=10;
			x/=10;
		}
		return res;
		
		
	}

}
