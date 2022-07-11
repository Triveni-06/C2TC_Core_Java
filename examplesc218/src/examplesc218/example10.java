package examplesc218;

public class example10 {

	public static void main(String[] args) {
		String s="great", t=" ";
		String u=s.concat(t);
		if(u==s)
			System.out.println("same");
		else 
			System.out.println("not same");
		String e=s+t;
		if(e==s)
			System.out.println("same");
		else
			System.out.println("not same");
	}

}
