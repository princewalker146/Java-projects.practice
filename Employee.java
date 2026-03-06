// NUMBER 3
public class Employee {
    String name;
    double salary;
    double calculateAnnualSalary(){
        return salary*12;
    }
}
 class FullTimeEmployee extends Employee{
    double bonus;
    double calculateAnnualSalary(){
        return salary*12+bonus;
    }

}
class PartTimeEmployee extends Employee{
    double hoursWorked;
    double hourlyRate;
    double caluculateAnnualSalary(){
        return hoursWorked*hourlyRate*12;
    }

    public static void main(String[] args) {
        FullTimeEmployee myWorker= new FullTimeEmployee();
        myWorker.name="Prince";
myWorker.salary= 313.42;
System.out.println("Annual salary: "+myWorker.calculateAnnualSalary());



        PartTimeEmployee myPartime= new PartTimeEmployee();
        myPartime.name="Prince";
        myPartime.salary= 2.456;
        System.out.println("Partime salary : "+myPartime.caluculateAnnualSalary());

    }
    
}