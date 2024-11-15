package numberbasedprogram;

import BasicProgramming.CountDigits;
import BasicProgramming.Power;

//To check a number is Armstrong first count its digits and add the powers on all the digits by taking exp equal to digit count.
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=858;i<6778990;i++) {
			if(checkAramstrong(i))
		System.out.println(i+">"+checkAramstrong(i));
		}
	}
	
	public static boolean checkAramstrong(int x){
		if(x<0)
			return false;
		byte digit_count=CountDigits.countDigits(x);
		int temp=x;
		int sum=0;
		
		while(x>0) {
			byte rem=(byte)(x%10);
			sum=sum+Power.getPower(rem, digit_count);
			x=x/10;
		}
		return temp==sum;
	}

}
