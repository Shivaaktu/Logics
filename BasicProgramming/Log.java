package BasicProgramming;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Log {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.###");
		// TODO Auto-generated method stub
		System.out.println("Enter log");
		int log=sc.nextInt();
		System.out.println("Enter base");
		int base=sc.nextInt();
			System.out.println("value of log "+log+" on base "+base+" is "+(df.format(getLogValueP(log, base))));
	}
	public static int getLogValue(int log, int base) {
		int ans=0;
		while(base<=log) {
			ans++;
			log=log/base;
		}
		return ans;
	}
	public static double getLogValueP(int log, int base) {
		return Math.log(log)/Math.log(base);
	}
}
