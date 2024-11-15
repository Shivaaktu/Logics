package PatternProgramming;

public class Pi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patternLast(5);

	}
	
	
	public static void printPattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+1;j++) {
				if(j%2==1) {
					System.out.printf("%-4d", i);
				}
				else {
					System.out.printf("%-4d",j/2);
				}
			}
			System.out.printf("%c",(char)10);
		}
	}
	
	public static void patternLast(int n) {
		for(int i=1;i<=n;i++) {
			int temp=i;
			for(int j=1;j<=n;j++) {
				System.out.printf("%-4d", temp);
				temp+=5;
			}
			System.out.printf("%c", (char)10);
		}
	}

}
