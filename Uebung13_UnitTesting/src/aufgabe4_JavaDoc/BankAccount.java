package aufgabe4_JavaDoc;

/*
 * Funktionell funktioniert diese Klasse nicht mehr. Da ich die anderen benötigten Klassen
 * gelöscht habe.
 * Hier geht es jedoch nur um JavaDoc
 */
/**
 * A bank account with limited credit and ability to be frozen (locked). 
 */
public class BankAccount {
	/** Default credit limit if not explicitly specified with the constructor */
	public static final long DEFAULT_CREDIT_LIMIT = -1000;

	private final long accountId;
	private long balance = 0;
	private long creditLimit;
	private boolean frozen = false;

	/**
	 * Creates a new bank account with the default credit limit. 
	 * @param accountId
	 *            ID of the bank account
	 */
	public BankAccount(long accountId) {
		this(accountId, DEFAULT_CREDIT_LIMIT);
	}

	/**
	 * Creates a new bank account with an explicit credit limit.
	 * @param accountId
	 *            ID of the bank account
	 * @param creditLimit
	 *            Explicit credit limit (negative)
	 */
	public BankAccount(long accountId, long creditLimit) {
		this.accountId = accountId;
		setCreditLimit(creditLimit);
	}

	/**
	 * Withdraws a given amount from the bank account, 
	 * provided that there is sufficient credit and the account is not frozen. 
	 * 
	 * @param amount
	 *            The amount of money to be withdrawn. 
	 *            The amount must be positive.
	 * @throws BankLimitException
	 *            Insufficient credit for withdrawal.
	 * @throws BankAccessException
	 *            The account is frozen.
	 */
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

	/**
	 * Deposits a given amount on the bank account, provided that the account is not frozen. 
	 * 
	 * @param amount
	 *            The amount of money to deposit. 
	 *            The amount must be positive.
	 * @throws BankLimitException
	 *            Balance overflow on deposit.
	 * @throws BankAccessException
	 * 			  The account is frozen.
	 */
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

	/**
	 * Gets the credit limit of the bank account.
	 * @return The current credit limit (0 or negative).
	 */
	public long getDeptLimit() {
		return creditLimit;
	}

	/**
	 * Sets the credit limit of the bank account.
	 * @param deptLimit
	 *            The new credit limit.
	 *            Must be 0 or negative,
	 */
	public void setCreditLimit(long deptLimit) {
		if (deptLimit > 0) {
			throw new IllegalArgumentException("Credit limit must be zero or negative");
		}
		this.creditLimit = deptLimit;
	}

	/**
	 * Gets the current balance of the bank account.
	 * @return The current balance.
	 */
	public long getBalance() {
		return balance;
	}

	/**
	 * Gets the account ID.
	 * @return The account ID.
	 */
	public long getAccountId() {
		return accountId;
	}

	/**
	 * Determines whether the account is frozen (closed).
	 * @return true if the account is frozen.
	 */
	public boolean isFrozen() {
		return frozen;
	}

	/**
	 * Freezes (locks) the account.
	 */
	public void freeze() {
		frozen = true;
	}

	/**
	 * Thaws (unlocks) the account.
	 */
	public void thaw() {
		frozen = false;
	}
	
	void setBalance(long amount) {
		balance = amount;
	}
}
