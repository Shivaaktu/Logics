package PatternProgramming;

public class Pi6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern5(5);
	}
	


	public static void print(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) 
				System.out.print("* ");
			System.out.println();
		}
	}
	
	public static void pattern2(int n) {
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
	}
	
	public static void pattern3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void pattern4(int n) {
		int temp=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)
				System.out.printf("%-4d",temp++);
			System.out.printf("%c",(char)10);
		}
	}
	
	public static void pattern5(int n) {
		int temp=0;
		for(int i=1;i<=n;i++) {
			temp+=i;
			for(int j=1;j<=i;j++);
				System.out.printf("%-4d",temp--);
			System.out.println();
			temp++;
		}
	}
}
