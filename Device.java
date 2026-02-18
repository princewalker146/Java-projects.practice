public class Device {
 String powerStatus;
 void powerOn(){
    System.out.println("My device's power is on now with"+powerStatus);

 }   
}
class phone extends Device{
    String nextworkType;
    void call(){
        System.out.println("We call someone with a phone from a distance and even video call "+nextworkType);

    }
}
class SmartPhone extends phone{
    String operatingSystem;
    void powerOn(){
        //Method overriding
        System.out.println("The smartphone is now availabel to use with "+operatingSystem);

    }
    void call(String contact){
        //Method overloading
        System.out.println("We call a person of our contact list  "+contact);
    }

    public static void main(String[] args){
        SmartPhone myPhone = new SmartPhone();
        myPhone.powerStatus="100% battery";
        myPhone.nextworkType="5G network";
        myPhone.operatingSystem="Android 12";
        myPhone.powerOn();
    }
}