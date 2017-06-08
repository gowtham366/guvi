import java.util.*;
public class H6{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n>0)
        {
            int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        Set<Integer> set = new HashSet<Integer>();
        brk:
        for(int j:arr) 
        {
            if(set.add(j) == false) 
            {   
                System.out.print(j);
                break brk;
            }
        }
        }
        else    
            System.out.print("0");
    }
}
