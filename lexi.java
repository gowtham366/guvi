import java.util.*;
class lexi{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int k=in.nextInt();
        int tmp=str.length()/k;
        if(str.length()%k==0)
        {
        String[] str1=new String[tmp];
        for(int i=0,j=0;i<str.length()&&j<tmp;j++)
        {
            str1[j]=str.substring(i,i+k);
            i=i+k;
        }
        Arrays.sort(str1);
        System.out.println(str1[0]);
        System.out.println(str1[str1.length-1]);
        }   
    }
}
