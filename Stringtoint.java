import java.util.*;
class Stringtoint {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		try{
		   int n=Integer.parseInt(str);
		   System.out.print(n);
		}catch(NumberFormatException n)
	{
	    System.out.print("Invalid input");
	}
	}
}
