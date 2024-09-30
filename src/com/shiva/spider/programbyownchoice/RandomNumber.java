package com.shiva.spider.programbyownchoice;
//generate a four digit random by Math class. or generate any random number in a user input range.(ie take input from user).
public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double random=Math.random();
		System.out.println("Random number generated of 4 digits "+(int)(random*10000));
		getRandom(150,230);
		
	}
	
	
	public static void getRandom(int start, int end) {
		//start is the smallest value from the range start ex 150.
//end is the largest value at which range end the largest number is not include in the range if we need to include that the +1 at end.
		int num=start+(int)(Math.random()*(end-start)+1);
		System.out.println("Radom nunber between "+start+" and "+end+" is "+num);
	}
	
	//generating number by Random class present in java.Util package.
	
	

}
