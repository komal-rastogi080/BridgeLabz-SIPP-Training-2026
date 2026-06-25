
public class Bank_account {
    private String accountNumber;
    private double balance;

    public Bank_account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        setBalance(initialBalance);
    }

    private void setBalance(double balance) {
        if(balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if(amount > balance){
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}
