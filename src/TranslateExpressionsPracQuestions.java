
public class TranslateExpressionsPracQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Lisa is cooking muffins. The recipe calls for 7 cups of sugar. 
		//She has already put in 2 cups. How many more cups does she need to put in?
		
		int cupsFinal = 7;
		int cupsCurrent = 2;
		int cupsNeeded = cupsFinal - cupsCurrent;
		System.out.println("1. Lisa needs " + cupsNeeded + " cups");
		
		//At a restaurant, Mike and his three friends decided to divide the bill evenly. 
		//If each person paid $13 then what was the total bill?
		
		int splitBill = 13;
		int friends = 4;
		int totalBill = splitBill * friends;
		
	System.out.println("2. The total bill is $" + totalBill);
	
	//How many packages of diapers can you buy with $40 if one package costs $8?
	
	int money = 40;
	int cost = 8;
	int diapers = money / cost;
	
	System.out.println( "3. You can buy " + diapers + " diapers.");
	
	// Last Friday Trevon had $29. Over the weekend he received some money for cleaning 
	// the attic. He now has $41. How much money did he receive?
	
	int friday = 29;
	int monday = 41;
	int payment = monday - friday; 
	System.out.println("4. Trevon received $" + payment +".");
	
	// Last week Julia ran 30 miles more than Pranav.
	//Julia ran 47 miles. How many miles did Pranav run?
	
	int firstRun = 30;
	int secondRun = 47;
	int totalRun = firstRun + secondRun;
	System.out.println("5. Pranav ran " + secondRun + " miles.");
	
	// How many boxes of envelopes can you buy with $12 if one box costs $3?
	
	int boxCost = 3;
	int boxMoney = 12;
	int boxQuant = boxMoney / boxCost; 
	System.out.println("6. I can buy " + boxQuant + " boxes.");
	
	// After paying $5.12 for a salad, Norachai has $27.10. 
	// How much money did he have before buying the salad?
	
	double saladPay = 5.12;
	double postSalad = 27.10;
	double preSalad = postSalad + saladPay;
	System.out.println("7. Norachai had $" + preSalad + " before buying the salad.");

	
//	 331 students went on a field trip. 
//	 Six buses were filled and 7 students traveled in cars. 
//	 How many students were in each bus?

	int carTravel = 7;
	int totalTravel = 331;
	int numberBuses =  6;
	int busRiders = (totalTravel - carTravel) / numberBuses;
	System.out.println("8. " + busRiders + " students were on each bus.");
	
	// Aliyah had $24 to spend on seven pencils. After buying them she had $10. How much did each pencil cost?
	
	int pBudget = 24;
	int pQuantity = 7;
	int pMinus = 10;
	int pCost = (pBudget - pMinus) / pQuantity; 
	System.out.println("9. Each pencil cost $" + pCost);
	
	// The sum of three consecutive numbers is 72. What is the smallest of these numbers?
	// 3x + 3 = 75, x = 72 
	int mid = 72/3;
	int small = mid-1;
	int large = mid+1;
	System.out.println(small + " " + mid + " " + large );
	
	
	//
	int remainingBoxes = 22; 
	int prefireBoxes = remainingBoxes * 2;
	int initialBoxes = prefireBoxes - 7;
	System.out.println(initialBoxes);
	
	
	//create a 2 digit num and sum the digits 
	//ex: 25 has a sum of digits of 7
	
	int num = 25; 
	int tens = num/10;
	int ones = num%10; 
	int sum = tens+ones;
	System.out.println(sum);

	
	//create a 3 digit num and sum the digits
	
	int secNum = 123;
	int hunds = secNum/100;
	int secOnes = secNum%10;
	int secTens = ;
	int sumTwo = hunds + secOnes + secTens; 
	System.out.println(sumTwo);
	
	
	
	
	
	
	
	
	
	

	
	
			
	
			
			
	
	
	
	
	
		
		
		

	}

}
