import java.util.Scanner;
public class TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String userName;
		double base, height;
		double area;
		
		//Ask user for name
		System.out.println("Enter your name: ");
		userName = input.nextLine();
		
		
		//Greet user
		System.out.println("Hello " + userName + "!");
		System.out.println("So, I heard you want to calculate the area of a triangle");
		//Read in info about a triangle
		
		System.out.println("Enter the base number");
		base = input.nextDouble();
		
		System.out.println("Enter the height: ");
		height = input.nextDouble();
		
		area = .5 *base * height;
		//Output area of a triangle
		System.out.println("The area of the triangle is " + area);
		input.close();
	}
	

}