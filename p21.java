import java.util.*;
public class GFG{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        if(size>0)
        {
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=in.nextInt();
        
        int pos=1,tmp=0,part=-1;
        int count[]=new int[4];
        for(int i:arr)
        {
            if(tmp==0)
                tmp=i;
            else
            {
                tmp+=i;
                if(tmp/pos==pos)
                {
                    part++;
                    count[part]=pos-1;
                    tmp=0;
                }
            }
            pos++;    
        }
        for(int i:count)
        System.out.print(i);
        pos=0;
        if(part!=0)
        {
            System.out.print("Not Possible");
        }else if(part==0)
        {
            for(int j:count)
            {
                if(j!=0)
                {
                    int i;
                    System.out.print("\n[");
                  for(i=pos;i<=j;i++)
                  {
                      if(i+1<=j)
                      System.out.print(arr[i]+",");
                      else
                      System.out.print(arr[i]+"]");
                  }
                  pos=i;
                  System.out.print(",[");
                  for(i=pos;i<size;i++)
                  { 
                      if(i+1<size)
                      System.out.print(arr[i]+",");
                      else
                      System.out.print(arr[i]+"]");
                  }
                }
            }
        }
        }
        else
        System.out.print("0");
    }
}
