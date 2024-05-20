import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductCalculator {

	//The recursive method is used to calculate the product of the numbers provided in the below section
	public static int calculateProduct(int[] numbers, int index) {
		//Base Case
		if (index == numbers.length) {
			return 1;
		}
		//Recursive case: multiplying the current number with result of the next
		return numbers[index] * calculateProduct(numbers, index + 1);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];
		
		//Asking the user to provide 5 numbers
		System.out.println("Enter five numbers: ");
		
		for (int i = 0; i < 5; i++) {
			//Using a loop to catch invalid entries
			while (true) {
				try {
					System.out.println("Number " + (i + 1) + ": ");
					numbers[i] = scanner.nextInt();
					break; //Exit loop when answer is correct
				} catch (InputMismatchException e) {
					System.out.println("Invalid input, try again using a number");
					scanner.next();
				}
			}
		}
		//Calculate the product from the recursive method
		int product = calculateProduct(numbers, 0);
		//Display the product
		System.out.println("The product of the inputted five numbers is: " + product);
		//Closing the scanner
		scanner.close();

	}

}
