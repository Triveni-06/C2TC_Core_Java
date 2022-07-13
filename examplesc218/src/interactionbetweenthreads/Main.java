package interactionbetweenthreads;

public class Main {

	public static void main(String[] args)throws InterruptedException {
		customer1 c=new customer1();
		Runnable t=()->
		{
			c.withdrawal(1000);
		};
		Runnable t1=()->
		{
			c.deposit(1500);
		};
		Thread thread=new Thread(t);
		Thread thread2=new Thread(t1);
		thread.start();
		thread2.start();
		thread.join();
		thread2.join();
		System.out.println(c.amount);
	}

}
