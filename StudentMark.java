abstract class StudentMark{
    void login(){
        System.out.println("Student marks logged in");
    }
   abstract void role();
}
class Student extends StudentMark{
    void role(){
        System.out.println("To improve upon the student's GPA");

    }
}
class Teacher extends StudentMark{
    void role(){
        System.out.println("Serves as the gpa booster");

    }
    public static void main(String[] args) {
        Student myPeople= new Student();
        myPeople.login();
        myPeople.role();
    }
}
// CONSTRUCTORS