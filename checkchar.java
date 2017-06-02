import java.util.*;
class checkchar {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		char a=in.next().charAt(0);
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
		    System.out.print("Vowel");
		else	
		    System.out.print("Consonent");
	}
}
