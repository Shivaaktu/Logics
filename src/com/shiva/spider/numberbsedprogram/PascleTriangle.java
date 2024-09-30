package com.shiva.spider.numberbsedprogram;

import com.shiv.spide.numbersystemconversation.GetCombination;

public class PascleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++) {
			getPascleRow(i);
			System.out.println();
		}
	}
	
	public static void getPascleRow(int n) {
		for(int j=0;j<n;j++){
			getCombination(n-1, j);
		}
	}
	
	public static void getCombination(int n, int r) {
		int comb=1;
		for(int i=0;i<r;i++) {
			comb=comb*(n-i)/(i+1);
		}
		System.out.print(comb+" ");
	}

}
