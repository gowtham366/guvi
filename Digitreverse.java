import java.util.*;
class Digitreverse{
    public static void main(String gow[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String str=String.valueOf(n);
        for(int i=str.length()-1;i>=0;i--)
        {
            n=Character.digit(str.charAt(i),10);
            System.out.print(n);
        }
    }
}
