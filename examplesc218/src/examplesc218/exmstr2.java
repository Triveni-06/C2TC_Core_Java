package examplesc218;

import java.util.Scanner;

public class exmstr2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		String B=sc.next();
		System.out.println(A.length()+B.length());
		if(A.compareTo(B)>0)
			System.out.println("yes");
		else
			System.out.println("no");
		System.out.println(A.substring(0,1).toLowerCase()+A.substring(1)+" "+Character.toUpperCase(B.charAt(0))+
				B.substring(1));
	}

}
