import java.util.*;
class Swapoddndeven{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {   
            if(i==str.length()-1)
            System.out.print(arr[i]);
            else if(i%2==0)
            System.out.print(arr[i+1]);
            else
            System.out.print(arr[i-1]);
        }
    }
}
