import java.util.*;
class Natural {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int sum=0;
		n=n-1;
		sum=n*(n+1)/2;
		System.out.print(sum);
	}
}
