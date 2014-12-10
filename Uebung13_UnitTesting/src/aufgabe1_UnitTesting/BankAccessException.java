package aufgabe1_UnitTesting;
public class BankAccessException extends RuntimeException {
	private static final long serialVersionUID = 6263156951988073377L;

	public BankAccessException(String message) {
		super(message);
	}
}
