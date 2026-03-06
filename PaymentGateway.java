abstract class PaymentGateway {

    void paymentStarted(){
        System.out.println("PAYMENT PROCESS STARTED");
    }

    abstract void pay(double amount);
}



