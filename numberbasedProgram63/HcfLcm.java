package numberbasedProgram63;

public class HcfLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		
		System.out.println(getHcf(7,5,3));

	}
	public static int getLcm(int a, int b, int c) {
		int big=a>b?(a>c?a:c):(b>c?b:c);
		
		for(int lcm=big; ;lcm+=big) {
			if(lcm%a==0&&lcm%b==0&&lcm%c==0)
				return lcm;
		}
		
	}
	public static int getHcf(int a, int b, int c) {
		int small=a<b?(a<c?a:c):(b<c?b:c);
		
		for(int hcf=small; ;hcf/=small) {
			if(a%hcf==0&&b%hcf==0&&c%hcf==0) 
				return hcf;
		}
	}

}
