import java.util.*;
class alphabetrnot {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		char a=in.next().charAt(0);
		if(a<65)
		    System.out.print("not");
		else	
		    System.out.print("alphabet");
	}
}
