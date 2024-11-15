package BasicProgramming;

public class Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.out.println(getHcf(41,800,19));
	}

	private static int getHcf(int a, int b, int c) {
		int small=(a<b)?(a<c?a:c):(b<c?b:c);
		for(int hcf=small; ;hcf/=2) {
			if(a%hcf==0&&b%hcf==0&&c%hcf==0) {
				return hcf;
			}
		}
	}
	public static int getLcm3(int a, int b, int  c) {
		int big=(a>b)?(a>c?a:c):(b>c?b:c);
		for(int lcm=big; ;lcm*=2) {
			if(lcm%a==0&&lcm%b==0&&lcm%c==0)
				return lcm;
		}
	}

	private static int getLcm(int a,int b, int c) {
		int big=getBig3(a,b,c);
		if(big%a==0 && big%b==0 && big%c==0)
			return big;
		int lcm=big*2;
		while(1>0) {
			if(lcm%a==0&&lcm%b==0&&lcm%c==0)
				return lcm;
			lcm=lcm*2;
		}	
	}

	public static int getBig3(int a, int b, int c) {
		return(a>b)?(a>c?a:c):(b>c?b:c);
	}

	
	
	

}
