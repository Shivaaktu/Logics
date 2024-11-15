package numberbasedProgram63;
//decimal to octal
public class P42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		decimalToOctal(19720);

	}
	
	public static void decimalToOctal(int decimal) {
		int octal=0;
		int ten_mul=1;
		
		while(decimal>0) {
			octal+=decimal%8*ten_mul;
			ten_mul*=10;
			decimal/=8;	
		}
		System.out.println(octal);
	}

}
