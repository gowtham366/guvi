import java.util.*;
public class h1{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        if(size>0)
        {
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=in.nextInt();
        Set<Integer> set = new HashSet<Integer>();
        for(int i:arr) 
        {
            if(set.add(i) == false) 
                System.out.println(i);
        }
        }
        else
        System.out.print("0");
    }
}
