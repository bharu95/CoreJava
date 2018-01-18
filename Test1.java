
public class Test1 {

	public static void main(String[] args) {

		int res = 0;
		int a = 10;
		int b = 0;
		String str = null;
		try {
			// res = a / b;
			System.out.println(str.length());
		}

		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		catch (Exception e1) {
			System.out.println("plz assign some values in string");
		}

		finally {
			System.out.println("finally block");
		}
		System.out.println(res);
	}

}
