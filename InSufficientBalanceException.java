
public class InSufficientBalanceException extends RuntimeException {
	String message;
	
	public InSufficientBalanceException() {
		super();
	}

	public InSufficientBalanceException(String message) {
		this.message=message;
	}

	@Override
	public String toString() {
		return "InSufficientBalanceException [message=" + message + "]";
	}
}
