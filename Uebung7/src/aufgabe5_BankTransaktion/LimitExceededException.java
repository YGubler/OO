package aufgabe5_BankTransaktion;

class LimitExceededException extends Exception {
	private static final long serialVersionUID = 1L; // optional

	public LimitExceededException(String message) {
		super(message);
	}
}
