abstract class BankAccount {
    String accountNumber;
    String holderName;
    double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    abstract double calculateInterest();

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
    }

    
    static class SavingAccount extends BankAccount {
        private static final double INTEREST_RATE = 0.04;

        public SavingAccount(String accountNumber, String holderName, double balance) {
            super(accountNumber, holderName, balance);
        }

        @Override
        double calculateInterest() {
            return balance * INTEREST_RATE;
        }
    }

   
    static class CurrentAccount extends BankAccount {
        private static final double INTEREST_RATE = 0.02;

        public CurrentAccount(String accountNumber, String holderName, double balance) {
            super(accountNumber, holderName, balance);
        }

        @Override
        double calculateInterest() {
            return balance * INTEREST_RATE;
        }
    }

    public static void main(String[] args) {
        SavingAccount saving = new SavingAccount("SA12345", "Alice", 10000);
        CurrentAccount current = new CurrentAccount("CA67890", "Bob", 50000);

        System.out.println("Saving Account Details:");
        saving.displayAccountInfo();
        saving.deposit(2000);
        saving.withdraw(3000);
        System.out.println("---------------");

        System.out.println("Current Account Details:");
        current.displayAccountInfo();
        current.deposit(1000);
        current.withdraw(5000);
    }
}
---------------------------------
OUTPUT:
Saving Account Details:
Account Number: SA12345       
Holder Name: Alice
Balance: 10000.0
Interest: 400.0
2000.0 deposited successfully.
3000.0 withdrawn successfully.
---------------------------------
Current Account Details:
Account Number: CA67890
Holder Name: Bob
Balance: 50000.0
Interest: 1000.0
1000.0 deposited successfully.
5000.0 withdrawn successfully.

-----------------------------------
