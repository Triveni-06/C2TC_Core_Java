import java.util.*;
public class exm5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		try {
			System.out.println(num/10);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division not allowed");
		}
	}
}
