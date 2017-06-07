import java.util.*;
public class P1{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        char arr[]=str.toCharArray();
        for(int i=(arr.length-1);i>=0;i--)
        System.out.print(arr[i]);
    }
}
