public class Car{

    private String brand;
    private int speed;

    public void setBrand(String brand){
    this.brand=brand;
    }
    public String getBrand(){
     return brand;
    }

    public void setSpeed(int speed){
        
        if(speed>0){
     this.speed=speed;       
        }
        else{
            System.out.println("Speed must not be negative");
        }
    }
    public int getSpeed(){
        return speed;
        
    }
     
    public static void main(String[] args){
        Car myVehicle= new Car();
        myVehicle.setBrand("Toyota");
        myVehicle.setSpeed(120);
        System.out.println("My car's brand is "+myVehicle.getBrand()+" at a speed of "+myVehicle.getSpeed());
    }
}