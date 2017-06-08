import java.util.*;
class Fact{
    public static void main(String gow[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
            {
                fact*=i;
            }
            System.out.print(fact);
    }
}
