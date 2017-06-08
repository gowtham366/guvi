import java.util.*;
class Romantoint {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String[] arr=str.split("");
		int sum=0,count=0;
		g:
		for(String i:arr)
		{   
		    System.out.println(i);
		    if(i=="X" || i=="I" || i=="V")
		    {
		        System.out.println(i);
		    if(i=="X")
		    {
		        if(count==0)
		        sum+=10;
		        else
		        sum-=1;
		    }
		    if(i=="I")
		    {
		        sum+=1;
		    }
		    if(i=="V")
		    {
		        if(count==0)
		        sum+=5;
		        else
		        sum-=1;
		    }
		    }
		    else
		    {
		    System.out.print("Invalid input");
		    break g;
		    }
		}
		System.out.print(sum);
	
	}
}
