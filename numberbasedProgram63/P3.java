package numberbasedProgram63;
//get set bits or count 1 bits.
public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countSetBits(16));
	}
	
	public static int countSetBits(long l) {
		int count=0;
		while(l>0) {
			if(l%2==1)
				count++;
			l/=2;
		}
		return count;
	}

}
