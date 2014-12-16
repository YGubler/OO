package aufgabe1_UnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {
	private static final int DEFAULT_TIMEOUT = 2000;

	@Test(timeout = DEFAULT_TIMEOUT)
	public void testWithdrawAmountPositivAndBalanceSmaller() throws BankLimitException {
		BankAccount acc = new BankAccount(99);
		long balance = acc.getBalance();
		acc.withdraw(1);
		assertEquals("Balance must be smaller than before", balance - 1, acc.getBalance());
	}

	@Test(timeout = DEFAULT_TIMEOUT, expected = BankAccessException.class)
	public void testWithdrawFrozen() throws BankLimitException {
		BankAccount acc = new BankAccount(99);
		acc.freeze();
		acc.withdraw(1);
	}

	@Test(timeout = DEFAULT_TIMEOUT, expected = IllegalArgumentException.class)
	public void testWithdrawAmountMustPositiv() throws BankLimitException {
		BankAccount acc = new BankAccount(99);
		acc.withdraw(-1);

	}

	@Test(timeout = DEFAULT_TIMEOUT)
	public void testWithdrawAmountNullBalanceMustSame() throws BankLimitException {
		BankAccount acc = new BankAccount(99);
		long balance = acc.getBalance();
		acc.withdraw(0);
		assertEquals("Balance minus Amount = 0 --> Balance must be the same as before", balance, acc.getBalance());
	}

	// Default Limit is -1000
	@Test(timeout = DEFAULT_TIMEOUT, expected = BankLimitException.class)
	public void testWithdrawLimit() throws BankLimitException {
		BankAccount acc = new BankAccount(99);
		acc.withdraw(9999);
	}

	@Test(timeout = DEFAULT_TIMEOUT)
	public void testWithdrawNegativeAmountNotChangeBalance() throws BankLimitException {
		BankAccount acc = new BankAccount(99);
		long balance = acc.getBalance();
		try {
			acc.withdraw(-1);
		} catch (IllegalArgumentException e) {
			assertEquals("Balance - negative Amount changed the balance", balance, acc.getBalance());
		}
	}

	@Test(timeout = DEFAULT_TIMEOUT)
	public void testWithdrawAmountMustBeInLong() throws BankLimitException {
		BankAccount acc = new BankAccount(99);
		long balance = acc.getBalance();
		try {
			acc.withdraw(10 + Long.MAX_VALUE);
		} catch (IllegalArgumentException e) {
			assertEquals("Balance - 10+MaxLong Amount not allowed to change Balance", balance, acc.getBalance());
		}
	}

	@Test(timeout = DEFAULT_TIMEOUT)
	public void testDepositAmountPositivAndBalanceSmaller() throws BankLimitException {
		BankAccount acc = new BankAccount(99);
		long balance = acc.getBalance();
		acc.deposit(1);
		assertEquals("Balance must be greater than before", balance + 1, acc.getBalance());
	}

	@Test(timeout = DEFAULT_TIMEOUT, expected = BankAccessException.class)
	public void testDepositFrozen() throws BankLimitException {
		BankAccount acc = new BankAccount(99);
		acc.freeze();
		acc.deposit(1);
	}

	@Test(timeout = DEFAULT_TIMEOUT, expected = IllegalArgumentException.class)
	public void testDepositAmountMustPositiv() throws BankLimitException {
		BankAccount acc = new BankAccount(99);
		acc.deposit(-1);

	}

	@Test(timeout = DEFAULT_TIMEOUT)
	public void testDepositAmountNullBalanceMustSame() throws BankLimitException {
		BankAccount acc = new BankAccount(99);
		long balance = acc.getBalance();
		acc.deposit(0);
		assertEquals("Balance plus Amount = 0 --> Balance must be the same as before", balance, acc.getBalance());
	}

	@Test(timeout = DEFAULT_TIMEOUT)
	public void testDepositNegativeAmountNotChangeBalance() throws BankLimitException {
		BankAccount acc = new BankAccount(99);
		long balance = acc.getBalance();
		try {
			acc.deposit(-1);
		} catch (IllegalArgumentException e) {
			assertEquals("Balance - negative Amount changed the balance", balance, acc.getBalance());
		}
	}

	@Test(timeout = DEFAULT_TIMEOUT)
	public void testDepositAmountMustBeInLong() throws BankLimitException {
		BankAccount acc = new BankAccount(99);
		long balance = acc.getBalance();
		try {
			acc.deposit(10 + Long.MAX_VALUE);
		} catch (IllegalArgumentException e) {
			assertEquals("Balance - 10+MaxLong Amount not allowed to change Balance", balance, acc.getBalance());
		}
	}

	@Test(timeout = DEFAULT_TIMEOUT, expected = BankLimitException.class)
	public void testDepositAmountOverflow() throws BankLimitException {
		BankAccount acc = new BankAccount(99);
		acc.deposit(10);
		acc.deposit(Long.MAX_VALUE);

	}

	@Test(timeout = DEFAULT_TIMEOUT)
	public void testTransferAmountNegativNotChangeBalance() throws BankLimitException {
		BankAccount acc1 = new BankAccount(1);
		BankAccount acc2 = new BankAccount(2);
		long balance1 = acc1.getBalance();
		long balance2 = acc2.getBalance();
		Bank bank = new Bank();
		try {
			bank.transfer(acc1, acc2, -1);
		} catch (IllegalArgumentException e) {
			assertEquals("Transfer negative Amount not allowed to change Balance", balance1, acc1.getBalance());
			assertEquals("Transfer negative Amount not allowed to change Balance", balance2, acc2.getBalance());
		}

	}

	@Test(timeout = DEFAULT_TIMEOUT)
	public void testTransferOK() throws BankLimitException {
		BankAccount acc1 = new BankAccount(1);
		BankAccount acc2 = new BankAccount(2);
		long balance1 = acc1.getBalance();
		long balance2 = acc2.getBalance();
		Bank bank = new Bank();
		bank.transfer(acc1, acc2, 1);
		assertEquals("Transfer nicht OK", balance1 - 1, acc1.getBalance());
		assertEquals("Transfer nicht OK", balance2 + 1, acc2.getBalance());
	}
	
	@Test(timeout = DEFAULT_TIMEOUT)
	public void testTransferToSameACC() throws BankLimitException{
		Bank bank = new Bank();
		BankAccount acc = new BankAccount(1);
		long balance = acc.getBalance();
		bank.transfer(acc, acc, 1);
		assertEquals("Transfer auf gleichen Account �ndert Balance", balance, acc.getBalance());
	}
	
	@Test(timeout = DEFAULT_TIMEOUT)
	public void testTransferToSameACCOverLimit() throws BankLimitException{
		Bank bank = new Bank();
		BankAccount acc = new BankAccount(1);
		acc.setCreditLimit(0);
		long balance = acc.getBalance();
		bank.transfer(acc, acc, 100);
		assertEquals("Transfer auf gleichen Account �ndert Balance", balance, acc.getBalance());
	}
	
	@Test(timeout = DEFAULT_TIMEOUT, expected =  IllegalArgumentException.class)
	public void testTransferAmountMaxLong() throws BankLimitException{
		Bank bank = new Bank();
		BankAccount acc1 = new BankAccount(1);
		BankAccount acc2 = new BankAccount(2);
		long balanced1 = acc1.getBalance();
		long balanced2 = acc2.getBalance();
		bank.transfer(acc1, acc2, Long.MAX_VALUE + 1);
		assertEquals("Transfere Long.MAX:VALUE + 1 �ndert ???", balanced1, acc1.getBalance());
		assertEquals("Transfere Long.MAX:VALUE + 1 �ndert ???", balanced2, acc2.getBalance());
	}
	
	/* Feeeeeeeehler, darf nicht passieren */
	@Test (timeout = DEFAULT_TIMEOUT)
	public void testTransferIncorrectOneSideNoBalanceChange() throws BankLimitException
	{
		Bank sparhafen = new Bank ();
		
		BankAccount accountyFrom = new BankAccount (1234);
		BankAccount accountyTo = new BankAccount (4321);
		
		long oldBalanceFrom = accountyFrom.getBalance();
		long oldBalanceTo = accountyTo.getBalance();
//		System.out.println("From: " + oldBalanceFrom + "\tTo: " + oldBalanceTo);
		try
		{
			sparhafen.transfer(accountyFrom, accountyTo, 2000);
		}
		catch (BankLimitException e) {}
		
//		System.out.println("From: " + accountyFrom.getBalance() + "\tTo: " + accountyTo.getBalance());;
		assertEquals ("transfer shouldn't change balance", accountyFrom.getBalance(), oldBalanceFrom);
		assertEquals ("transfer shouldn't change balance", accountyTo.getBalance(), oldBalanceTo);
	}
	
//	@Test(timeout = DEFAULT_TIMEOUT, expected = BankAccessException.class)
//	public void testTransferToFrozenAcc() throws BankLimitException{
//		Bank bank = new Bank();
//		BankAccount acc1 = new BankAccount(1);
//		BankAccount acc2 = new BankAccount(2);
//		acc2.freeze();
//		bank.transfer(acc1, acc2, 1);
//	}
//	
//	@Test(timeout = DEFAULT_TIMEOUT, expected = BankAccessException.class)
//	public void testTransferFromFrozenAcc() throws BankLimitException{
//		Bank bank = new Bank();
//		BankAccount acc1 = new BankAccount(1);
//		BankAccount acc2 = new BankAccount(2);
//		acc1.freeze();
//		bank.transfer(acc1, acc2, 1);
//	}
	
	
}
