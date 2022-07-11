package examplesc218;

import java.util.Scanner;

public class recursion {
	static int dc(int n)
	{
		if(n<=9)
		{
			return 1;
		}
		else
		{
			return 1+dc(n/10);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.print(dc(n));
	}

}
