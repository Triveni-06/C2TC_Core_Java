import java.util.*;
public class exm2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0,n=s.nextInt();
		for(int i=0;i<=n;i++)
			try
		{
				double data=100/i;
				System.out.println(data);

		}
		catch(ArithmeticException e) {
			count++;
			System.out.println(e);
		}
		finally {
			if(i==n) {
				if(count==0)
				System.out.println("No exception");
				else
					System.out.println(count +"exception handled");
			}
		}
	}
}




