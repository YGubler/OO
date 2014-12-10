package aufgabe1_UnitTesting;
public class BankLimitException extends Exception {
	private static final long serialVersionUID = 3412183939840612792L;

	public BankLimitException(String message) {
		super(message);
	}
}
