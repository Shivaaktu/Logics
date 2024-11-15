package PatternProgramming;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern5(5);

	}

	public static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j+i>n) 
					System.out.print(i+" ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
	public static void pattern3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i<j)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.print((char)10);
		}
	}
	
	public static void pattern4(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j>n)
					System.out.printf("%-3d",i);
				else
					System.out.printf("%3c",(char)32);
			}
			System.out.print((char)10);
		}
	}
	
	
	public static void pattern5(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j>n)
					System.out.printf(" %-1d",(i+j)%n);
				else
					System.out.printf(" %-1d",0);
			}
			System.out.println();
		}
	}
	public static void pattern6(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				 
			}
			System.out.println();
		}
	}
}
