import java.util.*;
public class h3{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        if(size>0)
        {
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=in.nextInt();
            match(arr);
        }
        else
        System.out.print("0");
    }
    public static void match(int arr[])
    {
        int pos=0;
        Arrays.sort(arr);
        for(int i:arr) 
        {
            if(i==pos) 
            System.out.println(i);
                pos++;
        }
        
    }
}
