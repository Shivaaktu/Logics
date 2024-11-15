package PatternProgramming;

public class Pi4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern(25);

	}
	public static void printPattern(int n) {
		int new_add=n*2-1;
		for(int i=1;i<=n;i++) {
			int temp=i;
			for(int j=1;j<=n;j++) {
				System.out.printf("%-5d", temp);
				if(j%2!=0)
					temp+=new_add;
				else
					temp+=n*2-new_add;
			}
			new_add-=2;
			
			System.out.printf("%c",(char)10);
		}
	}

}
