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
		long oldTo = to.getBalance();
		long oldFrom = from.getBalance();
		try{
			to.deposit(amount);
			from.withdraw(amount);			
		} catch (BankLimitException e){
			System.err.println(e.getMessage() + "\tBalanced from From und from To was reseted to the value before transaction");
			to.setBalance(oldTo);
			from.setBalance(oldFrom);
			throw e;
		}
	}

	public BankAccount getAccount(long id) {
		return accounts.get(id);
	}

	private long generateId() {
		return ++idCounter;
	}
}
