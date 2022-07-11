package examplesc218;

public class operation1 {
	int data=50;
	int change(int data)
	{
		data=data+100;
		return data;
	}
	public static void main(String[] args) {
		operation1 op=new operation1();
		System.out.println("before change" +op.data);
		op.data=op.change(500);
		System.out.println("after change" +op.data);

	}

}
