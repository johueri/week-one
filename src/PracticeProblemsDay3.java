import java.util.Scanner; 

public class PracticeProblemsDay3 {

	public static void main(String[] args) {
		//Ask the user for two integers. Check and see if the two integers are equal to each other. 
		//If they are, inform the the user that the numbers are equal;
		//otherwise, inform the user that the numbers are not equal
	Scanner input = new Scanner (System.in);
	
	double firstNumber, secondNumber;
	
	   System.out.println("Enter any number");
	   firstNumber = input.nextDouble();
	   System.out.println("Enter a second number ");
	   secondNumber = input.nextDouble();
			   
			   
	   if (firstNumber == secondNumber ) {
		   System.out.println("These two numbers are equal");
	   } else {
		   System.out.println("These two numbers are not equal");
	   }
	   
	   
			   
		
	   

	}

}
