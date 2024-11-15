package PatternProgramming;

public class Pi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern5(5);
	}

	public static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j+""+(char)32);
			}
			System.out.print((char)10);
		}
	}
	
	
	public static void pattern3(int n) {
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n;j++)
				System.out.print(i+""+(char)32);
			System.out.print((char)10);
		}
	}
	
	public static void pattern4(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=5;j>=1;j--)
				System.out.print(j+" ");
			System.out.print((char)10);
		}
	}
	
	public static void pattern5(int n) {
		int temp=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.printf("%-3d",temp++);
			}
			System.out.printf("%c",(char)10);
		}
	}
	
}
