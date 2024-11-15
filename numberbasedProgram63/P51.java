package numberbasedProgram63;

public class P51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(replace7(41072707));

	}
	
	public static int replace7(int x){
		int res=0;
		int ten_mul=1;
		while(x>0) {
			int rem=x%10;
			if(rem==7) {
				rem=0;
				res+=rem*ten_mul;	
			}
			else {
				res+=rem*ten_mul;
			}
			ten_mul*=10;
			x/=10;
		}
		return res;
	}

}
