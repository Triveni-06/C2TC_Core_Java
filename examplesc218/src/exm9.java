 abstract class exm9 {
	public abstract void m1();
	void m2();
	{
		System.out.println("Normal method");
	}
}
public class Child extends exm9{
	public void m1() {
		System.out.println("m1.method");
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.m1();
		c.m2();
	}

}
