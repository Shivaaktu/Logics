package arrayprograms;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,3,6,5,58,9,6,54,6,2,5,2,6};
		findOccurence(arr);

	}
	
	public static void findOccurence(int[] arr){
		int len=arr.length;
		for(int i=0;i<len;i++){
			int count=1;
			for(int j=i+1;j<len;j++) {
				if(arr[i]==arr[j]) {
					
					count++;
					arr[j]=arr[len-1];
					j--;
					len--;
				}
			}
			System.out.println(arr[i]+" comes "+count+" times");	  
		}
	}

}
