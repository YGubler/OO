package aufgabe5_BankTransaktion;

public class BankAccount {
	private int balance;
	private int lowerLimit;
	private int upperLimit;
	
	public BankAccount(int balance, int lowerLimit, int upperLimit) {
		this.balance = balance; 
		this.lowerLimit = lowerLimit;
		this.upperLimit = upperLimit;
	}
	
	public void deposit(int amount) throws LimitExceededException {
		if (amount < 0) {
			throw new IllegalArgumentException("negatuve amount");
		}
		if (balance + amount > upperLimit) {
			throw new LimitExceededException("upper limit");
		}
		balance += amount;
	}
	
	public void withdraw(int amount) throws LimitExceededException {
		if (amount < 0) {
			throw new IllegalArgumentException("negatuve amount");
		}
		if (balance - amount < lowerLimit) {
			throw new LimitExceededException("lower limit");
		}
		balance -= amount;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public static void transfer(BankAccount from, BankAccount to, int amount) throws TransactionException {
		try {
			from.withdraw(amount);
			try {
				to.deposit(amount);
			} catch (LimitExceededException e) {
				from.deposit(amount);
				throw e;
			}
		} catch (LimitExceededException e) {
			throw new TransactionException(e);
		}
	}
}
