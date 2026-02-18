
    public class Dog extends Animal{
    String breed;
    String bark;
   void makesSound(){
System.out.println("Breed: "+breed+"Bark"+bark);
    }
public static void main(String [] args){
    Dog myBuddy= new Dog();
    myBuddy.name="Jack";
    myBuddy.bark="woof-woff";
    myBuddy.breed="Africa";
    myBuddy.toEat();
    myBuddy.makesSound();
}
}

