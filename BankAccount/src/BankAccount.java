
public class BankAccount {
 protected double balance;

public BankAccount() {
	this.balance = 0;
	
}

public BankAccount(double newBalance) throws NegativeStartingBalance {
	if(newBalance >= 0 ){
	this.balance = newBalance;
	}else
		throw new NegativeStartingBalance(newBalance);
		
	
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}
public void deposit(double deposit) {
	this.balance = this.balance + deposit;
}
public void withdraw(double withdraw) {
	this.balance = this.balance + withdraw ;
}

@Override
public String toString() {
	return "BankAccount [balance=" + balance + "]";
}

}
