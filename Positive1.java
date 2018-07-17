import java.io.*;
import java.util.*;
class Positive1
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0)
        {
            System.out.println("positive");
        }
        else if(a<0)
        {
            System.out.println("negative");
        }
        else
        {
            System.out.println("Zero");
        }
        
    }
}
