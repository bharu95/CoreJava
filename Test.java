
public class Test {

	public static void main(String[] args) {
		System.out.println("***fs line");
		int res = 0;
		int a = 10;
		int b = 0;
		String str = null;
		try {
			try {
				System.out.println("**inside try block");
				res = a / b;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			System.out.println(str.length());
		} catch (Exception e1) {
			System.out.println("plz assign some values in string");
		}

		System.out.println(res);

	}
}
