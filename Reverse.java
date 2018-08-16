import java.io.*;
import java.util.*;
class Reverse
{
    public static void main(String arg[])
   {
       Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder s1=new StringBuilder();
        s1.append(s);
        s1=s1.reverse();
        System.out.print(s1);
   }
    
}
