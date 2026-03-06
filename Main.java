// NUMBER5
abstract class Payment {
    double amount;

    abstract void processPayment();
}

class CreditCardPayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Credit Card payment is acceptable");
    }
}

class MobileMoneyPayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Payment can also be made via MOMO");
    }
}

class BankTransferPayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("It can also be done by bank transfer");
    }
}

public class Main {
    public static void main(String[] args) {

        // Using abstraction: superclass reference
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new MobileMoneyPayment();
        Payment payment3 = new BankTransferPayment();

        // Call the processPayment() method
        payment1.processPayment(); // Credit Card
        payment2.processPayment(); // Mobile Money
        payment3.processPayment(); // Bank Transfer
    }
}