import java.io.*;
import java.util.*;
class Power
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int exponent=sc.nextInt();
        long result=1;
        while(exponent!=0)
        {
            result*=base;
            --exponent;
        }
        System.out.print(result);
    }
}
