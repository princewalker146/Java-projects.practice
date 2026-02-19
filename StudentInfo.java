public class StudentInfo{
    private String StudentName;
    private int age;
    public void setStudentInfo(String name){
        StudentName= name;
        System.out.println("Name: "+name);
    }
    public String getStudentInfo(){
        return StudentName;

    }
    public void setStudentAge( int studentAge){
        if(studentAge>0){
        studentAge=age;    
        }
        else{
            System.out.println("Age Invalid");
        }
    }
    public int getStudentAge(){
        return age;

    }
    public static void main(String[] args){
        StudentInfo myview= new StudentInfo();
        myview.setStudentInfo("Prince");
        myview.setStudentAge(20);
    
        System.out.println("Name :"+myview.getStudentInfo());
        System.out.println("Age "+myview.getStudentAge());


    }
}