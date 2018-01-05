import java.util.Scanner;
public class PracticeQuestionsThurSlideEleven {

	// Ask the user for her first name and last name. Use the length() method to tell her which is longer.
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String firstName;
		String lastName;
		
		System.out.println("Enter your first name: ");
		
		firstName = input.nextLine();
		System.out.println("Enter your last name: ");
		lastName = input.nextLine();
		
		
	
		if (firstName.length() > lastName.length()) {
			System.out.println("Your first name is longer than your last name.");
		} else if (lastName.length() > firstName.length()) {
			System.out.println("Your last name is longer than your first name.");
		} else if (firstName.length() == lastName.length()) {
			System.out.println("Your names are the same length");
		}
		// Ask the user for her first name and last name, then print her full name, including the necessary space between first and last name.
				
        System.out.println(firstName + " " + lastName);
        
        //Ask the user to answer your riddle. Use the appropriate method to examine the answer, ignoring case. 
        System.out.println("What is black, and white and read all over");
        
        String answer = input.nextLine();
        
        if (answer.contains("newspaper")) {
        System.out.println("Good job!");
        } else {
        	System.out.println("Please try again");
        }
       
        
            
        
       
	}

}
