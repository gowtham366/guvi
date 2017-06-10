import java.util.*;
class Oddnumbers{  
 public static void main(String args[]){  
    Scanner in=new Scanner(System.in);
    int fst=in.nextInt();
    int lst=in.nextInt();
    for(int i=fst;i<=lst;i++)
    {
        if(i%2!=0)
        System.out.println(i);
    }    
    }
}  
