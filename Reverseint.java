import java.io.*;
import java.util.*;
class Reverseint
{
    public static void main(String arg[])
   {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder n1=new StringBuilder();
        n1.append(n);
        n1=n1.reverse();
        System.out.print(n1);
   }
}
