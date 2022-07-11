class Super1{
	void m1() {
		System.out.println("Super m1");
	}
	final void m2() {
		System.out.println("Super m2");
	}
}
public class exm10 extends Super1 {
	void m1()
	{
		System.out.println("sub m1");
	}

	public static void main(String[] args) {
		exm10 obj=new exm10();
		obj.m1();
		obj.m2();
	}

}
