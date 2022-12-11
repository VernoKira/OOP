package problem4;

public class Test {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		
		Account a = new Account(1);
		Account b = new SavingsAccount(2, 5);
		Account c = new CheckingAccount(3);
		
		a.deposit(100);
		b.deposit(100);
		c.deposit(100);
		c.withdraw(10); 
		c.withdraw(10);
		c.deposit(50);
//		c.deposit(20);
		bank.open(a);
		bank.open(b);
		bank.open(c);
		bank.update();
		
		
		System.out.print(bank);
	}

}

