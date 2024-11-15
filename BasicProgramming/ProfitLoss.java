package BasicProgramming;
//In this program  we have to get cost and sell from user and firstly see if there is a loss or profit and store them on a viable.
//and then use formula profit%=profit*100/cost and loss%=loss*100/cost. and also use an else condition to give output even if 
//both sell and cost price are equal.

import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter cost price ");
		int cost=sc.nextInt();
		System.out.println("Enter sell price");
		int sell=sc.nextInt();
		profitLoss(cost, sell);			
	}

	private static void profitLoss(int cost, int sell) {
		if(cost<sell) {
			int profit=sell-cost;
			System.out.println("You earn profit of Rs"+profit+" or "+(profit*100.0)/cost+"%");
			return;
		}
		else if(cost>sell) {
			int loss=cost-sell;
			System.out.println("You have loss of Rs"+loss+" and "+(loss*100.0)/cost+"%");
			return;
		}
		else
			System.out.println("no profit loss");
	}
	
}
