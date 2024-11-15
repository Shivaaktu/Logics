package numberbasedProgram63;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static byte coutBits(long x) {
		byte count=0;
		while(x>0) {
			count++;
			x/=2;
		}
		return count;
	}

}
