
public class Test2 {
	
	public static void main(String[] args)  {
		 Bank b=new Bank();
		 System.out.println("Balance is:"+b.getBalance());
		 try {
			b.withDraw(500);
		} catch (InSufficientBalanceException e) {
			System.out.println(e.toString());
		}
		 b.depositAmount(5000);
		 System.out.println("Balance is:"+b.getBalance());
		 try {
			b.withDraw(500);
		} catch (InSufficientBalanceException e) {
			System.out.println(e.toString());
		}
		 System.out.println("Balance is:"+b.getBalance());
		 
}


}
