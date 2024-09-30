package com.shiva.spider.programbyownchoice;
//Program to get LCM of three number of three numbers
public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans=getLcm(23,45,90);
		System.out.println(ans);

	}
	
	public static int getLcm(int a, int b, int c) {
		int big=(a<b)?(a>c?a:c):(b>c?b:c);
		for(int i=big; ;i+=big) {
			if(i%a==0&&i%b==0&&i%c==0){
				return i;
			}
		}
	}

}
