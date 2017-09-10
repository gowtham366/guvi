import java.util.*;
class Isogram {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		int count=0;
		for(char ch:str.toCharArray())
		{
		    if(set.add(ch)==true)
		        count++;
		    else
		        break;
		}
		if(count==str.length())
		    System.out.print("Isogram");
		else
		    System.out.print("Not-Isogram");
	}
}
