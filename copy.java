// import java.util.Scanner;

// public class Main {
//      public static void main(String[] args) {
    	 
//     	int integerCount=0;
//         boolean isNumberValid= true; 
                
//         Scanner myObj = new Scanner(System.in);
        
//         System.out.println("This program counts the number of digits in an integer entered by the user. \r\n Enter -1 to exit");        
        
//         while(integerCount ==0){
        	
//         	//Prints Input Request
//             System.out.println("Enter a Number: ");
            
//             //Accepts input from user
//             String userIntegerInput = myObj.nextLine();
            
            
//             //Try/Catch Block: Testing to see if input is a valid integer
//             //If not valid, it will request number again
//             try {
//             	Integer.parseInt(userIntegerInput);
//             	 isNumberValid= true;            	
//             }catch(NumberFormatException e) {
//             	System.out.println("That was not a Valid Number. Please Enter a Valid Number. \r\n");
            	
//             	//notifying program off invalid int: will not run the follow if block
//             	isNumberValid=false;            	
//             };
//             if(isNumberValid) {
//             	if(Integer.parseInt(userIntegerInput)!= -1) {
            		
//             		//Counting length of Input and saving to integerCount
//             		integerCount = userIntegerInput.length();
            		
            		
//             		System.out.println("Integer input was : "+ userIntegerInput);
//             		System.out.println("The number of digits in "+ userIntegerInput +" is " + integerCount +".\r\n" );
            		
//             		//resetting integerCount
//             		integerCount=0;
            		
//             	}else if(Integer.parseInt(userIntegerInput)== -1) {
            		
//             		System.out.println("\r\nThank you for playing. Terminating Program Now...");
//             		//Terminating Program
//             		System.exit(0);
//             	}
//             }
//         }
//         //Closing Scanner
//         myObj.close();                 
//     }
// }


// //Student Name: Brónagh Colton
// //Student ID: 21128535



// public class StudentTester {
	
// 	public static void main(String[]args) {
// 		//Initialising Student Array
// 		Student[] students = new Student[5];
		
// 		//Populating Array with 5 Students
// 		students[0]=new Student();
// 		students[0].setStudentName("Adam");
// 		students[0].setStudentID(111111);

// 		students[1]=new Student();
// 		students[1].setStudentName("Laura");
// 		students[1].setStudentID(111112);
		
// 		students[2]=new Student();
// 		students[2].setStudentName("John");
// 		students[2].setStudentID(111113);
		
// 		students[3]=new Student();
// 		students[3].setStudentName("Louise");
// 		students[3].setStudentID(111114);
		
// 		students[4]=new Student();
// 		students[4].setStudentName("Sarah");
// 		students[4].setStudentID(111115);
		
// 		//Looping over the array
// 		for(int i=0; i< students.length; i++) {

// 			//printing Student names and ID numbers
// 			System.out.println(students[i].getStudentName() + 
// 				" is a student at NUIG.  \r\nTheir student ID number is " 
// 				+ students[i].getStudentID());
			
			
			
// 			//Other Option for Printing Names and IDs
// 			//	**********************************
// //			String name =students[i].getStudentName();
// //			long id =students[i].getStudentID();
// //			System.out.println(name +" is a student at NUIG.  \r\nTheir student ID number is "+ id);
		
// 		}
// 	}
	
	
// }

// //Student Name: Brónagh Colton
// //Student ID: 21128535



// public class Student {
// String name;
// //Personally I would not list the ID with capital to start, but that is how it is listed in the UML Diagram
// long IDnumber;

// //setting name
// public void setStudentName(String studentName) {
// 	name=studentName;
// }
// //returns name
// public String getStudentName() {
// 	return name;
// }
// //setting studentID
// public void setStudentID(long studentID) {
// 	IDnumber=studentID;
// }
// //returns studentID
// public long getStudentID() {
// 	return IDnumber;
// }

// }

// //Student Name: Brónagh Colton
// //Student ID: 21128535
