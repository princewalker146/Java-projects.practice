
// NUMBER 2
public class Student {
    private int studentId;
    private String name;
    private double score;


    // SETTERS FOR PUBLIC VOIDS

    public void setName( String name){
this.name=name;
    }
    public void setStudentID(int studentId){
        this.studentId=studentId;
    }

    public void setScore(double score){
    this.score=score;
    }
// THE GETTERS

int getStudentId( int studentId){
    return studentId;
}
String getName( String name){
    return name;
}

double getScore( double score){
    if(score<=70.0 && score>=100.0){
    return 'A';
    }
    else if(score<= 60.0 && score>=69.0){
        return 'B';
    }
    else if(score<= 50.0 && score>=59.0){
        return 'C';
    }
    else if(score<=45.0 && score>=49.0){
        return 'D';
    }
    else if (score <45){
return 'F';
    }
    else{
        return 'G';
    }
}
public static void main(String[] args) {
    Student mypupil= new Student();
mypupil.setName("Prince");
mypupil.setScore(50.1);
mypupil.setStudentID(2269050);
}
}
