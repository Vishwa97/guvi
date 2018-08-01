import java.io.*;
import java.util.*;
class pali
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String reverse="";
        String ori=sc.nextLine();
        int l=ori.length();
        for(int i=l-1;i>=0;i--)
        reverse=reverse+ori.charAt(i);
        if(reverse.equals(ori))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
        
    }
}

