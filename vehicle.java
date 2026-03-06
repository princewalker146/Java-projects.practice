// NUMBER4
public class vehicle {
    String brand;
    public void startEngine(String brand){
        this.brand=brand;
        System.out.println("My vehicle's engine started");
    }
}
class Car extends vehicle{
    public void startEngine(){
        System.out.println("My car's engine have started by sparking");

    }
}
class Motorcycle extends vehicle{
    public void startEngine(){
        System.out.println("This motor started with a loud blurrrr");
    }

    public static void main(String[] args) {
        Car myVeh= new Car();
        myVeh.brand="Hyndai";
        Motorcycle myMotor= new Motorcycle();
        myMotor.brand="Melody";
        System.out.println("My Car's brand  :"+ myVeh.brand);
        System.out.println("My Motorcycle's Brand : "+myMotor.brand);
    }
}