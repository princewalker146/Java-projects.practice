public class LivingThing {
  String name;
  void toBreathe(){
    System.out.println("All living things like "+name+" breathe");
  }  
}
 class Animal extends LivingThing{
String species;
void moveAround(){
    System.out.println("The animals of the same king are known as "+species);
}

}
 class Dog extends Animal{
    String breed;
    void bark(){
System.out.println("Dog breeds all over "+breed);
    }

    public static void main(String[] args) {
        Dog myPet= new Dog();
        myPet.breed="Africa";
        myPet.species="Species";
        myPet.name="Jack";
        myPet.toBreathe();
        myPet.bark();
    }
}
// Method overloading :It is the same method name with same class but different parameters
// Method overriding:child's class replaces the method it's inherited