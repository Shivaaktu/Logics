package com.shiv.spide.numbersystemconversation;

public class GetCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static int getCombination(int n, int r) {
		int comb=1;
		for(int i=0;i<r;i++) {
			comb=comb*(n-i)/(i+1);
		}
		return comb;
	}

}
