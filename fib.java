import java.util.*;
class fib {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=-1,b=1;
		for(int i=0;i<n;i++)
		{
		    int tmp=a+b;
		    a=b;
		    b=tmp;
		    System.out.print(tmp+" ");
		}
	}
}
