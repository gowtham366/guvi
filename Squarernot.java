import java.util.*;
class Squarernot{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int pts[]=new int[8];
        int chck[]=new int[4];
        int ct=0;
        for(int i=0;i<8;i++)
        {
            pts[i]=in.nextInt();
            if(i%2!=0)
            {
            chck[ct]=Math.abs(pts[i]-pts[i-1]);
            ct++;
            }
        }
        if(chck[0]==chck[2] || chck[1]==chck[3])
            System.out.println("Square");
        else
            System.out.println("Not square");
    }
}
