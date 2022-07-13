package interactionbetweenthreads;
public class customer1 {
	int amount=1000;//instance variable
	public void deposit(int amount)
	{
		this.amount+=amount;//iv.amount=iv.amount+LV.amount;
		System.out.println("Deposit completed");
}
	public void withdrawal(int amount)
	{
		this.amount-=amount;//iv.amount=iv.amount-Lv.amount;
		System.out.println("withdraw Completed");
	}
}
