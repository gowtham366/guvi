import java.util.*;
class Stringg{  
 public static void main(String args[]){  
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    str=splitt(str);
    }
    public static String splitt(String str)
    {
        String arr[]=str.split(" ");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        return "0";
    }
} 
