import java.util.*;
class leapyr{
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int yr=in.nextInt();
		if(yr%400==0)
		    System.out.print("leap year");
		else
		    System.out.print("not");
	}
}
