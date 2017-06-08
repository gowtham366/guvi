import java.util.*;
class fact{
    public static void main(String gow[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int f=1;
        for(int i=1;i<=n;i++)
            {
                f*=i;
            }
            System.out.print(f);
    }
}
