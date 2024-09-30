package com.shiva.spider.programbyownchoice;

public class Number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		replace(74770077);// The argument you give here must not start with 0 because if we start with 0 then that number is not integer
		// it becomes octal in that case it behaves internally different.

	}
	
	public static void replace(int x){
		int result=0;
		int multiple=1;
		while(x>0) {
			int rem=x%10;
			if(rem==7)
				rem=0;
			result=rem*multiple+result;
			x=x/10;
			multiple=multiple*10;
		}
		System.out.println(result);
	}

}
