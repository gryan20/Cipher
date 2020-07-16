//



import java.util.Scanner;
import java.util.Random;


public class Cipher {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String enternumbers;
		int total;
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		int fourthNumber;
		int fifthNumber;
		
		
		System.out.println("Please enter 5 numbers between 0 and 19");
		System.out.println("First Number:");
		firstNumber = scan.nextInt(); 
		System.out.println("Second Number:");
		secondNumber = scan.nextInt();
		System.out.println("Third Number:");
		thirdNumber = scan.nextInt();
		System.out.println("Fourth Number:");
		fourthNumber = scan.nextInt();
		System.out.println("Fifth Number:");
		fifthNumber = scan.nextInt();
		
		
		 
		scan. close();
		
		total = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
		
		System.out.println(total); // might have to delete this line later
		
		
		
	}

}
