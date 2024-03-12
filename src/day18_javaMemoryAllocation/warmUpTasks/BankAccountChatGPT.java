package day18_javaMemoryAllocation.warmUpTasks;

public class BankAccountChatGPT {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccountChatGPT(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    // toString method
    @Override
    public String toString() {
        return "Account Details: \n" +
                "Account Number: " + accountNumber + "\n" +
                "Account Holder: " + accountHolder + "\n" +
                "Balance: $" + balance;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a BankAccount instance
        BankAccountChatGPT myAccount = new BankAccountChatGPT("123456", "John Doe", 1000.0);

        // Deposit money
        myAccount.deposit(500.0);

        // Withdraw money
        myAccount.withdraw(200.0);

        // Print account details
        System.out.println(myAccount);
    }
}
