public class MobilePhone{
private String ownerName;
private int batteryLevel;
public void setOwnerName(String ownerName){
    this.ownerName=ownerName;
   
}
 public String getOwnerName(){
    return ownerName;
 }
 public void setBatteryLevel( int batteryLevel){
    
    if(batteryLevel>=0 &&batteryLevel<=100){
      this.batteryLevel=batteryLevel;
    }
else{
    System.out.println("Invalid battery level");
}
 }
 public int getBatteryLevel(){
    return batteryLevel;
 }
 public static void main(String[] args){
    MobilePhone myCell= new MobilePhone();
myCell.setOwnerName("Prince");
System.out.println("Owner's Name: "+myCell.getOwnerName());

myCell.setBatteryLevel(90);
System.out.println("Battery Level: "+myCell.getBatteryLevel()+"%");
}
 }