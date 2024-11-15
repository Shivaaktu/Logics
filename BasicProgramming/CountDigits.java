package BasicProgramming;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x=2353633663663l;
		System.out.println(countDigits(15235));//Remember that always use l postfix with long value;
		//otherwise compiler will consider it as int even in case if we store value on long data type

	}
	public static byte countDigits(long x) {
		byte count=0;
		while(x>0) {
			count++;
			x=x/10;
		}
		return  count;
	}

}
