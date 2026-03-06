public interface PaymentSystem {

    void pay(double amount);
    void refund(double amount);
}
class mobileMoney implements PaymentSystem{
    public void pay(double amount){
        System.out.println("Mobile money payment successful: " +amount);
        
    }
    public void refund(double amount){
        System.out.println("Refund successful "+amount);
    }
}
class creditCard implements PaymentSystem{
    public void pay(double amount){
        System.out.println("Credit card payment successful : "+amount);
    }
    public void refund(double amount){
        System.out.println("Credict card refund sucessfull: "+amount);
    }
    public static void main(String[] args) {
        mobileMoney myvend= new mobileMoney();
        myvend.pay(3.45);
        myvend.refund(56.74);
        creditCard myPay= new creditCard();
        myPay.pay(445.45);
        myPay.refund(9.345);
    }
}
// WE HAVE ADOPTED THE HEART OF POLYMORHISM

