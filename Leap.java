import java.io.*;
import java.util.*;
class Leap
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%4==0 || n%100==0 || (n%400==0))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no"); 
        }
    }
}
