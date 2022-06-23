package examplesc218;

import java.util.Scanner;

public class search {

	public static void main(String[] args) {
		int n,x,flag=0,i;
		System.out.println("enter the number of elements are:");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		int a[] = new int[n];
		System.out.println("enter the elements:");
		for(i=1;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter the elements to be searched:");
		x=s.nextInt();
		for(i=1;i<n;i++)
		{
			if(a[i]==x)
			{
				System.out.println("position of" +x+ " is :"+i);
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Elements"+x+"not found");
		}
	}

}

