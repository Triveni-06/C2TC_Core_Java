interface Int1{
	final int a=10;
	static void display() {
		System.out.println("Default Method");
	}
}
public class exm7 implements Int1 {

	public static void main(String[] args) {
		Int1.display();

	}

}
