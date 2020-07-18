
import java.util.Scanner;
import java.util.Random;


public class Cipher {

	public static void validateNumber(int numberToValidate) {
		if (numberToValidate>19)
		{ 
			System.out.println("Please read directions and try again");
			System.exit(0);
		}
	
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		int total;
		int firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber;
		int num1;
		int num2;
		int num3;
		int num4;
		int key = rand.nextInt(10); // I chose 10 to be inclusive to 9

		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Gabby");
		System.out.println("PROGRAMMING ASSIGNMENT 1 - Cipher");
		System.out.println("");
		System.out.println("Welcome to the Cipher Program");
		System.out.println("Please enter 5 numbers between 0 and 19");
		System.out.println("1st Number: ");
		firstNumber = scan.nextInt();
		validateNumber(firstNumber);
		System.out.println("2nd Number: ");
		secondNumber = scan.nextInt();
		validateNumber(secondNumber);
		System.out.println("3rd Number: ");
		thirdNumber = scan.nextInt();
		validateNumber(thirdNumber);
		System.out.println("4th Number: ");
		fourthNumber = scan.nextInt();
		validateNumber(fourthNumber);
		System.out.println("5th Number: ");
		fifthNumber = scan.nextInt();
		validateNumber(fifthNumber);

		scan.close();

		total = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;

		//Here is where I split the total number to digits 0 through 9 for the tens and ones place

		num1 = (total / 10); // for the tens place
		num2 = total % 10; // for the ones place
		num3 = ((num1 + key) % 10);
		String eTenDigit = "" + num3; //e is for encrypted
		num4 = ((num2 + key) % 10);
		String eOneDigit = "" + num4;

		System.out.println("Total = " + total);
		System.out.println("Your random key is: " + key);
		System.out.println("Encrypted Number: " + eTenDigit + eOneDigit);

	}
}
