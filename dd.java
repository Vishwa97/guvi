import java.util.Scanner;
public class SumofGivenIntegers {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Input :");
		int N=in.nextInt();
		int K=in.nextInt();
		int sum=0;
		int a[]=new int[N];
		for (int i = 0; i < a.length; i++) {
			a[i]=in.nextInt();
		}
		for(int i=0;i<K;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Output :");
		System.out.println(sum);		
	}
}
