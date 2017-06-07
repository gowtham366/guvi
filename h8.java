import java.util.*;
public class h8{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        if(size>0)
        {
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=in.nextInt();
        Arrays.sort(arr);
        for(int i:arr) 
        {
            for(int j:arr)
            {
                for(int k:arr)
                {
                    if((i+j)==k)
                    System.out.println(i+" "+j+" "+k);
                }
            }
        }
        }
        else
        System.out.print("0");
    }
}
