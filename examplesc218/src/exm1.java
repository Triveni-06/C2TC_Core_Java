
import java.util.*;
public class exm1 {
	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			for(int i=0;i<=n;i++)
				try
			{
					int data=100/i;
					System.out.print(i+"");

			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
		}
	}

