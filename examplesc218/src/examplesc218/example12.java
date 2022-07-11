package examplesc218;

public class example12 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			validate(age);
			System.out.println("welcome to vote");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	private static void valiadte(int age)throws InvalidAgeException{
		if(age<18) {
			throw new InvalidaAgeException("Invalid age");
		}
	}

}
