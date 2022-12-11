package problem4;

import java.util.Objects;

public class CheckingAccount extends Account{
	
	private int cntTransactions = 0;
	private static final int FREE_TRANSACTIONS = 4;
	
	public CheckingAccount(int num) {
		super(num);
		this.cntTransactions = 0;
	}
	
	public void deposit(double sum) {
		super.deposit(sum);
		this.cntTransactions++;
	}
	
	public void withdraw(double sum) {
		super.withdraw(sum);
		this.cntTransactions++;
	}
	
	public int getCntTransactions() {
		return this.cntTransactions;
	}
	
	public void deductFee() {
		if(this.cntTransactions > FREE_TRANSACTIONS) {
			super.withdraw((this.cntTransactions - FREE_TRANSACTIONS) * 0.02);
		}
	}
	
	public String toString() {
		return super.toString() + "\nThe number of transactions: " + this.cntTransactions + "/" + FREE_TRANSACTIONS + "\n";
	}
	
	public boolean equals(Object o) {
		  if (!super.equals(o)) return false;
		  CheckingAccount a = (CheckingAccount)o;
		  return this.cntTransactions == a.cntTransactions;
	}
	public int hashCode() {
		return Objects.hash(getBalance(), getAccountNumber(), cntTransactions);
	}
}
