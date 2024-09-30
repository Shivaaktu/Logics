package com.shiva.spider.pattern;

public class pr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for this pattern
//		*                   * 
//		  *               *   
//		    *           *     
//		      *       *       
//		        *   *         
//		          *           
//		        *   *         
//		      *       *       
//		    *           *     
//		  *               *   
//		*                   * 

		pattern(11);
	}
	
	public static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j||i+j==n+1)
					System.out.print("* " );
				else
					System.out.print("  ") ;
			}
			System.out.println();
		}
	}

}
