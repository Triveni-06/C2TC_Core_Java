package tnsif.c2tc.b18.UserException.entities;

import java.util.Scanner;

public class main {
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		try {
			validate(age);
			System.out.println("welcome to vote");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	private static void validate(int age)throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Invalid age");
		}
	}

}

