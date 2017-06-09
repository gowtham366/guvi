import java.util.*;
class Anagram{
    public static void main(String mur[])
    {
        int count=0;
        Scanner in=new Scanner(System.in);
        String str1=in.nextLine();
        str1=str1.replaceAll("\\s","");
        String str2=in.nextLine();
        str2=str2.replaceAll("\\s","");
        //System.out.println(str2);
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        //System.out.println(arr1);
        //System.out.println(arr2);
        str1=new String(arr1);
        str2=new String(arr2);
        if(str1.equals(str2))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
