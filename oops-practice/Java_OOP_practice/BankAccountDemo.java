
class BankAccount {
    private String accountNumber;
    private String holder;
    private double balance;
    static int totalAccounts = 0;

    public BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Overdraft not allowed for " + holder);
    }

    public void getStatement() {
        System.out.println(holder + " | " + accountNumber + " | Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount[] acc = {
            new BankAccount("A101","Komal",5000),
            new BankAccount("A102","Riya",7000),
            new BankAccount("A103","Aman",6000)
        };

        for (BankAccount a : acc) {
            a.deposit(1000);
            a.withdraw(500);
            a.deposit(700);
            a.withdraw(300);
            a.withdraw(200);
            a.getStatement();
        }

        System.out.println("Total Accounts: " + totalAccounts);
    }
}
