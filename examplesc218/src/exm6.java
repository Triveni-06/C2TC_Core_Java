interface FirstInterface{
	public void myMethod();
}
interface SecondInterface{
	public void myotherMethod();
}
class DemoClass implements FirstInterface,SecondInterface{
public void myMethod() {
	System.out.println("FirstInterface");
}
public void myotherMethod() {
	System.out.println("SecondInterface");
}
}
public class exm6 {
	public static void main(String[] args) {
		DemoClass myobj=new DemoClass();
		myobj.myMethod();
		myobj.myotherMethod();

	}

}
