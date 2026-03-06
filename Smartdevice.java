public interface Smartdevice {

    void pay( double price);
    void brand(String brand);
}
class Laptop implements Smartdevice{

    public void pay(double price){
        System.out.println("Payment sucessful :"+price);
    }
    public void brand(String brand){
        System.out.println("Brand :"+brand);
    }
}
class SmartPhone implements Smartdevice{

    public void pay(double price){
        System.out.println("Credict card payment successful: "+price);
        
    }
    public void brand(String brand){
System.out.println("Brand :"+brand);
    }

    public static void main(String[] args) {
        Laptop myPC= new Laptop();
        myPC.pay(645.24);
        myPC.brand("Macbook Pro");

        SmartPhone myPhone= new SmartPhone();
        myPhone.pay(87.34);
        myPhone.brand("TECNO");
    }
   
}