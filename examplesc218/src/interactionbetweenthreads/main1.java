package interactionbetweenthreads;

public class main1 {
	public static void main(String[] args)throws InterruptedException {
		counter c=new counter();
		Runnable t=()->
		{
			c.counter(1000);
		};
		Runnable t1=()->
		{
			c.counter(1500);
		};
		Thread thread=new Thread(t);
		Thread thread1=new Thread(t1);
		thread.start();
		thread1.start();
		thread.join();
		thread1.join();
		System.out.println(c.count);
	}

}
