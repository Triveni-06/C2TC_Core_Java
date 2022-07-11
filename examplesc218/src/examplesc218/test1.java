package examplesc218;
import java.util.*;
public class test1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<=n;i++)
			try
		{
				int data=100/i;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.print(i+"");
		}
	}
}
