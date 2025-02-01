class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
   }
   class BankAccount {
    private double balance;
   
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
   
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance! Your current balance is: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining balance: " + balance);
        }
    }
   }
   
   public class CustomExceptionExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000); // Initial balance is 5000
   
        try {
            account.withdraw(6000); // Trying to withdraw more than balance
        } catch (InsufficientBalanceException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Transaction completed.");
        }
    }
   }