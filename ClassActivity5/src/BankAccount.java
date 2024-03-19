
public class BankAccount {
	String accountNumber;
	String accountHolderName;
	double balance;
	
	void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposited: "+ amount);
		System.out.println("Current Balance: "+ balance);
	}
	
	void withdraw(double amount) {
		if (balance >= amount) {
		balance = balance - amount;
		System.out.println("Withdrawn: "+ amount);
		checkBalance();
		}
		else {
			System.out.println("Insufficient funds for withdraw");
		}
	}
	
	void checkBalance() {
		System.out.println("Current Balance: "+ balance);	
	}
	
	void displayAccountInfo() {
		System.out.println("Balance: " + balance);
		System.out.println("Account number: " + accountNumber);
		System.out.println("Account holder: " + accountHolderName + "\n");
	}

}
