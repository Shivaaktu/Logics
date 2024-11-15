package numberbasedProgram63;

import static java.lang.System.*;
public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		out.println("stat the prigram");
//		print(2030680);//0002368
		Prints(123456);
	}
	public static void print(int n) {
		int num=0;
		int ten_mul=1;
		while(n>0) {
			int rem=n%10;
			if(rem==0)
				out.print(rem);
			else {
				num+=rem*ten_mul;
				ten_mul*=10;
			}
			n/=10;
		}
		System.out.println(num);
	}
	
	public static void Prints(int n) {
		String s=Integer.toString(n);
		System.out.println(s);
	}

}
