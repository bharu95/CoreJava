
public class Bank {
	double balance;
	
	public Bank() {
		balance=1000.0;
	}
	
	
	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public void withDraw(double amount) throws InSufficientBalanceException{
		if(balance-amount>1000) {
			 balance=balance-amount;
		 }else{
			 System.out.println("**Customer try to with draw an amount:"+amount+" But");
			 throw new InSufficientBalanceException("Balance is Low");
		 }
	}
		 public void depositAmount(double amount){
			 System.out.println(amount+":is going to deposit:");
			 balance=balance+amount;
			 System.out.println("**Remaining balance is:"+balance);
		 }

	

}
