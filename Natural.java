import java.util.*;
class Natural {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int sum=0;
		if(n==1)
		    System.out.print("0");
		else{
		for(int i=1;i<n;i++)
		    sum+=i;
		}
		System.out.print(sum);
	}
}
