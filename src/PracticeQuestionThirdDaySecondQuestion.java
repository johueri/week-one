import java.util.Scanner; 

public class PracticeQuestionThirdDaySecondQuestion {
	
	public static void main(String[] args) {
		
		// Ask the user for a number. Tell the user if that number is even or odd.
		
		Scanner input = new Scanner(System.in);
		
		int enterNumber;
		double evenOdd;
		
		System.out.println("Enter any integer.\n");
		enterNumber = input.nextInt();
		
		evenOdd = enterNumber%2;
		
		if (evenOdd == 0) { 
			System.out.println("This number is even.");
		} else {
			System.out.println("This number is odd");
		}
		
		
		
		
		
				
	}

}
