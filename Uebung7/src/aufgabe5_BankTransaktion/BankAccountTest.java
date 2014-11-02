package aufgabe5_BankTransaktion;

public class BankAccountTest {
	private static final int START_AMOUNT = 1000;

	public static void main(String[] args) throws TransactionException {
		BankAccount first = new BankAccount(START_AMOUNT, 100, 5000);
		BankAccount second = new BankAccount(START_AMOUNT, 100, 1500);

		try {
			// BankAccount.tratransfer(first, second, 200); // ok
			// BankAccount.tratransfer(first, second, 2000); // fails at from.withdraw()
			BankAccount.transfer(first, second, 800); // fails at to.deposite()
		} finally {
			checkMoneyStillThere(first, second, 2 * START_AMOUNT);
		}
	}
	private static void checkMoneyStillThere(BankAccount first, BankAccount second, int expectedAmount) {
		String result = (first.getBalance() + second.getBalance() == expectedAmount) ? "yes" : "no";
		System.out.println("money still there? " + result);
	}
}
