package examplesc218;

import java.util.Scanner;

public class recursion1 {
	public static void print_digits(int n) {
		if(n<=9) {
			System.out.print(n);
			return;
		}
		print_digits(n/10);
		System.out.print(n%10);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		print_digits(n);
	}

}
