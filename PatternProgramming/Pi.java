package PatternProgramming;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(9);

	}
	
	public static void pattern(int n){
		for(int i=1;i<=n;i++) {
				System.out.print(" ");
		}
		System.out.println("*");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j>n)
					System.out.print("*");
				else
					System.out.print(" ");	
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void pattern2(int n) {
		for(int i=1;i<=n;i++) {
			
		}
	}

}
