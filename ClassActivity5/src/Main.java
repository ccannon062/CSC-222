
public class Main {
	public static void main(String[] args) {
		
		
        // Create an instance of BankAccount and set its attributes
		System.out.println("Initial Account Information:");
        BankAccount account1 = new BankAccount();
        account1.accountNumber = "123456";
        account1.accountHolderName = "John Doe";
        account1.balance = 1000.0;
        
        account1.displayAccountInfo();
        

        // Perform operations
        System.out.println("Performing Operations: ");
        account1.deposit(500.0);
        account1.withdraw(200.0);
        account1.checkBalance();
        
        //Final information
        System.out.println("\nFinal Information: ");
        account1.displayAccountInfo();
        
    }

}
