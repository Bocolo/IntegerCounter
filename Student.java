
public class Student {
    String name;
    long IDnumber;
    
    public Student(){
        name="Unassigned";
        IDnumber=0;
    }

    public void setStudentName(String studentName) {
        name=studentName;
    }
    public String getStudentName() {
        return name;
    }
    public void setStudentID(long studentID) {
        IDnumber=studentID;
    }
    public long getStudentID() {
        return IDnumber;
    }
    
    }