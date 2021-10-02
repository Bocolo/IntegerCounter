//This is a Programming assignment to write a program that accepts and integer input and count the number of digits entered by the user
// the porgram should continually ask for input and exit when -1 is entered



import java.util.Scanner;
//I would have used long over int to allow for more possible entries.  
//However, the question says integer, and I assumed that to mean 'int'

public class Main {
     public static void main(String[] args) {
    	int integerCount=0;
        boolean isNumberValid= true; 
        String userIntegerInput;
        //creating Scanner
        Scanner myObj = new Scanner(System.in);        
        System.out.println("This program counts the number of digits in an integer entered by the user. \r\nEnter -1 to exit.\r\n");        
        
        while(integerCount ==0){
        	
        	//Prints Input Request
            System.out.print("Enter a Number: ");
            
            //Accepts input from user
            userIntegerInput = myObj.nextLine();
            
            
            // Try/Catch Block: Testing to see if input is a valid integer
            //If not valid, it will request number again
            try {
            	Integer.parseInt(userIntegerInput);
            	 isNumberValid= true;  
            	 
            }catch(NumberFormatException e) {
            	System.out.println("That was not a Valid Integer. Please Enter a Valid Number. \r\n");
            	
            	//notifying program of invalid int: program will not run the following if block
            	isNumberValid=false;            	
            };
            
            //Continuing program if the number entered is valid
            if(isNumberValid) {
            	
            	//checking for 'Exit' request / -1 entry
            	if(Integer.parseInt(userIntegerInput)!= -1) {
            		
            	/*	this IF is to account for negative numbers or positive numbers listed with the '+' symbol
            		If the number begins with '-'/'+', only the digits will be listed in the integer count that shows on screen e.g. -66  will be 2 digits not 3
            		 +66 will be 2 digits not 3*/
            		
            		if(userIntegerInput.charAt(0)== '-'|| userIntegerInput.charAt(0)== '+') {            			
            	/*	Counting length of input MINUS the preceding +/- symbol
            			 and saving to integer count*/
            			integerCount = userIntegerInput.length()-1;
            			
            		
            		}else {
            		//Counting length of Input and saving to integerCount
            			integerCount = userIntegerInput.length();
                 		
            		}            	
            		
            		System.out.println("Integer input was: "+ userIntegerInput);
            		System.out.println("The number of digits in the number "+ userIntegerInput +" is " + integerCount +".\r\n" );
            		
            		//resetting integerCount
            		integerCount=0;
            		
            		//Terminating Program if number entered is -1
            	}else {
            		
            		System.out.println("\r\nThank you for playing. Terminating Program Now...");
            		
            		//Terminating Program
            		System.exit(0);
            	}
            }
        }
        //Closing Scanner
        myObj.close();                 
    }
}


//Student Name: Brónagh Colton

