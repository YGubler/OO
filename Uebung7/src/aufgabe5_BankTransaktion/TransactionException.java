package aufgabe5_BankTransaktion;

class TransactionException extends Exception {

	private static final long serialVersionUID = 1L;

	public TransactionException(Throwable cause) {
		super("Transaction failed.", cause);
	}
}
