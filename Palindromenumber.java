import java.util.*;
import java.lang.*;
class Palindromenumber {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int check=0;
		while(n>0){
		    check=check*10+(n%10);
		    n=n/10;
		}
		if(check==n)
		System.out.print("palindrome");
		else
		System.out.print("not");
	}
}
