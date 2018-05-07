import java.util.InputMismatchException;
import java.util.Scanner;

public class Compute {
	static int firstNumber = 0;
	static int secondNumber = 0;
	static int result = 0;
	static Scanner s = new Scanner(System.in);
	static void takeFirstNumber() {
		try {
			System.out.println("Enter the First Number");
			 firstNumber = s.nextInt(); // throw new InputMismatchException();
			}
			catch(InputMismatchException e) {
				System.out.println("0-9 Need to be enter in First Number");
				s.nextLine();
				takeFirstNumber();
			}
	}
	static void takeSecondNumber() {
		try {
			System.out.println("Enter the Second Number");
			 secondNumber = s.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("0-9 Need to be enter in Second Number");
				s.nextLine();
				takeSecondNumber();
			}
	}
	static void divide() {
		try {
			result=  firstNumber / secondNumber;
			}
			catch(ArithmeticException e) {
			System.out.println("U Divide a  Number with Zero ");
			takeSecondNumber();
			divide();
			}
	}
	static void print() {
		System.out.println("Result is "+result);
		s.close();
	}
	public static void main(String[] args) {
		
		takeFirstNumber();
		takeSecondNumber();
		divide();
		print();
		
		
		
		
		
		s.close();

	}

}
