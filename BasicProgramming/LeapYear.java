package BasicProgramming;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.out.println(leapYear(2000));

	}
	
	public static boolean leapYear(int year) {
		return (year%400==0)||(year%4==0&&year%100!=0);
	}

}
