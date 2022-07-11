package examplesc218;

public class operation2 {
	int data=50;
	void change(operation2 op)
	{
		data=data+100;
	}
	public static void main(String[] args) {
		operation2 op=new operation2();
		System.out.println("before change" +op.data);
		op.change(op);
		System.out.println("after change"+op.data);
	}
}
