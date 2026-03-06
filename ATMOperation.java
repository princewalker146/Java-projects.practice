// NUMBER 6.

interface ATMOperations {

    void withdraw(double amount);

    void deposit(double amount);

    void checkBalance();
}


class BankATM implements ATMOperations {

    // Hidden data (encapsulation)
    private double balance;

    // Constructor
    public BankATM(double initialBalance) {
        balance = initialBalance;
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        }
        else if (amount > balance) {
            System.out.println("Insufficient funds");
        }
        else {
            balance -= amount;
            System.out.println("Withdrawal successful");
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
        }
        else {
            balance += amount;
            System.out.println("Deposit successful");
        }
    }

    // Check balance method
    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}



public class Main {

    public static void main(String[] args) {

        ATMOperations atm = new BankATM(1000);

        atm.checkBalance();

        atm.deposit(500);

        atm.withdraw(300);

        atm.checkBalance();
    }
}