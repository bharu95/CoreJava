abstract class Genericserv{
	
	abstract void calc(int a,int b);
}

class Httpserv extends Genericserv{
	void calc(int a,int b) {
		System.out.println("sum of two var:"+(a+b));
	}
}

public class TestDemo {

	public static void main(String[] args) {
		Genericserv gs=new Httpserv();
		gs.calc(100,200);

	}

}
