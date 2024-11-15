package arrayprograms;
//to print number and freq which have odd freq.
public class P12 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr= {2,34,4,45,6,2,2,7,3,7,7,0,9,65,0,8,4};
		printOddFre(arr);

	}
	
	public static void printOddFre(int[] arr) 
	{
		int len=arr.length;
		for(int i=0;i<len;i++) 
		{
			int count=1;
			for(int j=i+1;j<len;j++) 
			{
				if(arr[i]==arr[j]) 
				{
					count++;
					arr[j]=arr[len-1];
					j--;
					len--;
				}
			}
			if(count%2==1) 
			{
				System.out.println(arr[i]+" occurs "+count+" times");
			}		
		}
	}
}


