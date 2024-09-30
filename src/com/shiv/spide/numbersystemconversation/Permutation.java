package com.shiv.spide.numbersystemconversation;
//write a java program to give permutation by formula npr. factorail
public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getPermutation(4,2);

	}
	
	public static int getPermutation(int n, int r) {
		if(r>n) {
			System.out.println("Arrangement in this case is not possible");
			return 0;
		}
			
		int den=n-r;
		int perm=1;
		for(int i=0;i<r;i++) {
			perm=perm*(n-i);
		}
		
		System.out.println(perm);
		return perm;
		
	}

}
