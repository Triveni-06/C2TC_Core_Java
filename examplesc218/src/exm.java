import java.util.Scanner;
public class exm {

	public static void main(String[] args) {
		try {
			throw 5;
		}
		catch(int e) {
			System.out.println("Got the Exception"+e);
		}
	}

}
