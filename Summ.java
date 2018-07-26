import java.io.*;
import java.util.*;
class Summ
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<k;i++)
        {
        sum+=a[i];
            
        }
            System.out.print(sum);
    }
}
