public class StudentTester {
	
	//Student student1,student2, student3,student4,student5;
	//Student[] students = {student1 ,student2, student3,student4, student5};
    public static void main(String[] args) {
        Student[] students = new Student[5];
    
	
	
        students[0].setStudentName("Adam");
        students[0].setStudentID(111111);
            
        students[1].setStudentName("Laura");
        students[1].setStudentID(111112);
        
        students[2].setStudentName("John");
        students[2].setStudentID(111113);
        
        students[3].setStudentName("Louise");
        students[3].setStudentID(111114);
        
        students[4].setStudentName("Sarah");
        students[4].setStudentID(111115);
                
    }
	
}
/*


public class Student {
String name;
long IDnumber;

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
//Create a tester class which:
//	 i) creates an array to hold a collection of Student objects.
//	 ii) adds a number of instances of Student to the array.
//	 ii) uses a loop to traverse the array and display the contents.*/

/*

public class StudentTester {
	
	//Student student1,student2, student3,student4,student5;
	//Student[] students = {student1 ,student2, student3,student4, student5};
	public static void main(String[]args) {
		Student[] students = new Student[5];
		
		
		students[0].setStudentName("Adam");
		students[0].setStudentID(111111);
			
		students[1].setStudentName("Laura");
		students[1].setStudentID(111112);
		
		students[2].setStudentName("John");
		students[2].setStudentID(111113);
		
		students[3].setStudentName("Louise");
		students[3].setStudentID(111114);
		
		students[4].setStudentName("Sarah");
		students[4].setStudentID(111115);
		
		for(int i=0; i< students.length; i++) {
			String s =students[i].getStudentName();
			long l =students[i].getStudentID();
//			System.out.println(students[i].getStudentName() + 
//					" is a student at NUIG.  Their student ID number is " 
//		+ students[i].getStudentID());
			System.out.println(s + 
					" is a student at NUIG.  Their student ID number is " 
		+ l);
		}
	}
	
	
}



//public String getStudentName() {
//	return name;
//}

//public long getStudentID() {
//	return IDnumber;
//}
//
//student1 = new Student();
//student1.setStudentName("Adam");
//student1.setStudentID(111111);
//
//student2 = new Student();
//student2.setStudentName("Laura");
//student2.setStudentID(111112);
//
//student3 = new Student();
//student3.setStudentName("John");
//student3.setStudentID(111113);
//
//student4 = new Student();
//student4.setStudentName("Louise");
//student4.setStudentID(111114);
//
//student5 = new Student();
//student5.setStudentName("Sarah");
//student5.setStudentID(111115);




*/