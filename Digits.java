import java.io.*;
import java.util.*;
class Digits
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n!=0)
        {
        n /=10;
        ++count;
        }
        System.out.print(count);
    }
}
