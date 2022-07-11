package examplesc218;

public class example11 {

	public static void main(String[] args) {
		String str="techno@serve@india";
		String[] arrOfStr=str.split("@",2);
		for(String a:arrOfStr)
			System.out.println(a);
	}

}
