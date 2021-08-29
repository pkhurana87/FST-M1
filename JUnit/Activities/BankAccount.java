public class BankAccount {
    private Integer balance;
    
    // Create a constructor
    public BankAccount(Integer initialBalance) {
        balance = initialBalance;
        System.out.println(balance);
    }

    // Add method to calculate
    // balance amount after withdrawal
    public Integer withdraw(Integer amount) {
        if (balance < amount) {
        	
            throw new NotEnoughFundsException(amount, balance);
        }
        balance -= amount;
        System.out.println(balance);
        return balance;
      
    }
    
    
}