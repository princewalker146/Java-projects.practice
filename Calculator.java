// public class Calculator {
  
//     // Method by adding
// int add(int a,int b){
//     return a +b;
// }
// // Method by squaring
// int square(int x){
//     return x*x;
// }

// public static void main(){
//     Calculator myMachine= new Calculator();
//     int sum= myMachine.add(12, 13);
//     int square= myMachine.square(4);
//     System.out.println("Sum "+sum);
//     System.out.println("Square "+square);
// }
// }
public class Calculator{

    double memory;
    double multiply(int a, int b){
        return a*b;
    }
    void storeInMemory( double value){
        memory= value;
        
       
        System.out.println("Updated memory of "+value);
    }

    public static void main(String [] args){
        Calculator myCalculator= new Calculator();
        double multiply= myCalculator.multiply(5,6);
        myCalculator.storeInMemory(multiply);
System.out.println("This is the updated memory of "+multiply);

    }
}