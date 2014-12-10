package aufgabe1_UnitTesting;
import java.util.HashMap;
import java.util.Map;

public class Bank {
	private final Map<Long, BankAccount> accounts = new HashMap<>();
	private static long idCounter = 0;

	public BankAccount openAccount() {
		BankAccount account = new BankAccount(generateId());
		accounts.put(account.getAccountId(), account);
		return account;
	}

	public void transfer(BankAccount from, BankAccount to, long amount) throws BankLimitException {
		to.deposit(amount);
		from.withdraw(amount);
	}

	public BankAccount getAccount(long id) {
		return accounts.get(id);
	}

	private long generateId() {
		return ++idCounter;
	}
}
