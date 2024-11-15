package PatternProgramming;

public class Pi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern1(5);
	}
	
	public static void printPattern1(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+1;j++) {
				if(j%2==0)
					System.out.printf("%-4d",i);
				else {
					System.out.printf("%-4d",(j/2+1));
				}
			}
			System.out.printf("%c",(char)10);
		}
	}

}
