public class Appliance {
  String brand;
  void turnOn(){
    System.out.println("Appliance turned on");
  }
}
class WashingMachine extends Appliance{
  void turnOn(){
    // Mehod overiding
    System.out.println("Washing machine is now running");
  }
void wash( double minutes){
// Method overloading
    System.out.println("It took "+minutes+" of washing");


}
  public static void main(String[] args) {
    WashingMachine wm = new WashingMachine();
  wm.brand="LPG";
  System.out.println("This brand is "+wm.brand);
  wm.turnOn();
  wm.wash(30);
  }
}