package BasicProgramming;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int findBig4(int a, int b, int c, int d) {
		int big=a;
		if(b>big) {
			big=b;
		}
		if(c>big) {
			big=c;
		}
		if(d>big) {
			big=d;
		}
		return big;
	}

}
