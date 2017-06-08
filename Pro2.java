import java.util.*;
class Pro2{
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		if(n>0)
		{
		String arr[]=String.valueOf(n).split("");
		Arrays.sort(arr);
		if(k<=arr.length && k>0)
		{
		for(int i=0;i<arr.length-k;i++)
		    System.out.print(arr[i]);
		}
		else
		    System.out.print("Invalid");
		}
		else
		    System.out.print("0");
		
	}
}
