import java.util.*;
class Pro17{
    public static void main(String gow[])
    {
        Scanner in=new Scanner(System.in);
        int X=in.nextInt();
        int Y=in.nextInt();
        String str=String.valueOf(X);
        int n=0;
        for(int i=0;i<str.length();i++)
            {
                n=Character.digit(str.charAt(i),10);
                X*=n;
            }
        if(X==Y)
            System.out.print("seed");
        else    
            System.out.print("not");
    }
}
