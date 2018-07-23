import java.io.*;
import java.util.*;
class Largest
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        for(int i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
            System.out.println(a[a.length-1]);
        
    }
}



