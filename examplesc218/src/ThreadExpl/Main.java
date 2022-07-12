package ThreadExpl;

public class Main {

	public static void main(String[] args) {
		Thread thread=new Demo();
		Thread thread1=new Demo1();
		thread.start();
		thread1.start();
		System.out.println("Hello world");
	}
}
