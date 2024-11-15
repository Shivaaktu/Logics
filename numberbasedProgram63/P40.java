package numberbasedProgram63;
//convet binary to decimal

import static java.lang.System.*;
public class P40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out.println(binaryToDecimal(0111101));

	}
	public static int binaryToDecimal(int binary) {
		int decimal=0;
		int two_mul=1;
		while(binary>0) {  
			decimal+=binary%10*two_mul;
			binary/=10;
			two_mul*=2;
		}
		return decimal;
	}

}
