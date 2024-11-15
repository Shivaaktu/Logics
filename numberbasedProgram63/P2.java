package numberbasedProgram63;

import java.io.ObjectInputStream.GetField;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getBitsDetail(17);
	}
	
	public static void getBitsDetail(long l) {
		int bit1=0;
		int bit0=0;
		
		while(l>0) {
			if(l%2==1)
				bit1++;
			else
				bit0++;
			l/=2;		
		}
		System.out.println("0 bits and 1 bits respectibely "+bit0+" and "+bit1);
	}

}
