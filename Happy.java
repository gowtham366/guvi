import java.util.*;
class Happy{
    public static void main(String gow[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n!=1)
        {   
            int sum=0;
            String str=String.valueOf(n);
            for(int i=0;i<str.length();i++)
            {
                n=Character.digit(str.charAt(i),10);
                n*=n;
                sum+=n;
            }
            n=sum;
        }
        System.out.print("Happy number");
    }
}
