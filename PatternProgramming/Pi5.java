package PatternProgramming;

public class Pi5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print('y');
	}
	
	public static void print(char c) {
		char b='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(b+++" ");
			}
			System.out.println();
		}
	}

}
