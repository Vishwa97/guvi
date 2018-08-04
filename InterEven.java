import java.io.*;
import java.util.*;
class InterEven
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        for(int i=n;i<k;i++)
        {
            if(i%2==0)
            {
            System.out.println(i);
            }
        }
    }
}
