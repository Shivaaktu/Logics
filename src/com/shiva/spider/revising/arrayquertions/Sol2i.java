package com.shiva.spider.revising.arrayquertions;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Sol2i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,4,5,8,-7,5,12,-5};
		findMaxMul(arr);

	}
	
	public static int findMaxMul(int[] arr) {
		int mul=0;
		int i1=0;
		int i2=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if((arr[i]*arr[j])>mul) {
					mul=arr[i]*arr[j];
					i1=i; i2=j;
				}
			}
		}
		System.out.println("The max multiply and its indexes are "+mul+" indexs are "+i1+" and "+i2);
		return mul;
	}

}
