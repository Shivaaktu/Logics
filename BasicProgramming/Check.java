package BasicProgramming;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=12;//17
		a++;
		++a;
		int b=a++;//14
		b++;
		int c=a++ +--b;//27
		c--;
		--b;
		
		int d=++a+b++ + --c;//57
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		
	}
}
