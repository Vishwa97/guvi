import java.io.*;
import java.util.*;
class Odd
{
public static void main(String arg[])
{
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n%2==0 && n>0)
    {
        System.out.print("Even");
    }
    else if(n>0 && n%2!=0)
    {
        System.out.print("Odd");
    }
    if(n<0)
    {
        System.out.print("invalid");
    }
}
}
