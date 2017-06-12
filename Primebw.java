import java.util.*;
class Primebw{  
 public static void main(String args[]){  
    Scanner in=new Scanner(System.in);
    int flag=0,count=0; 
    int strt=in.nextInt();
    int ct=in.nextInt();
    for(int j=strt;j<=ct;j++)
    {
    int m=j/2;    
    for(int i=2;i<=m;i++)
    {   
        flag=0;
        if(j%i==0)
        {    
        flag=1;    
        break;    
        }    
    }    
    if(flag==0)    
    System.out.println(j);    
    }
    }
}  
