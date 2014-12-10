package aufgabe1_UnitTesting;
public class BankAccount {
	public static final long DEFAULT_CREDIT_LIMIT = -1000;

	private final long accountId;
	private long balance = 0;
	private long creditLimit;
	private boolean frozen = false;

	public BankAccount(long accountId) {
		this(accountId, DEFAULT_CREDIT_LIMIT);
	}

	public BankAccount(long accountId, long creditLimit) {
		this.accountId = accountId;
		setCreditLimit(creditLimit);
	}

	public void withdraw(long amount) throws BankLimitException {
		if (amount < 0) {
			throw new IllegalArgumentException("Amount must be 0 or positive");
		}
		if (isFrozen()) {
			throw new BankAccessException("Account is frozen");
		}
		if (balance < creditLimit + amount) {
			throw new BankLimitException("Insufficient credit");
		}
		balance -= amount;
	}

	public void deposit(long amount) throws BankLimitException {
		if (amount < 0) {
			throw new IllegalArgumentException("Amount must be 0 or positive");
		}
		if (isFrozen()) {
			throw new BankAccessException("Account is frozen");
		}
		if (Long.MAX_VALUE - amount < balance) {
			throw new BankLimitException("Balance overflow");
		}
		balance += amount;
	}

	public long getDeptLimit() {
		return creditLimit;
	}

	public void setCreditLimit(long deptLimit) {
		if (deptLimit > 0) {
			throw new IllegalArgumentException("Credit limit must be zero or negative");
		}
		this.creditLimit = deptLimit;
	}

	public long getBalance() {
		return balance;
	}

	public long getAccountId() {
		return accountId;
	}

	public boolean isFrozen() {
		return frozen;
	}

	public void freeze() {
		frozen = true;
	}

	public void thaw() {
		frozen = false;
	}
	
	void setBalance(long amount) {
		balance = amount;
	}
}
