import java.io.*;
import java.util.*;
class Prime
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=false;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag=true;
                break;
            }
        }
        if(!flag)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
