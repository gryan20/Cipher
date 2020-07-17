//Gabby Ryan
//Programming Fundamentals Summer Session 2
//Cipher



import java.util.Scanner;
import java.util.Random;


public class Cipher {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Random rand = new Random();
		
		String enternumbers;
		int total;
		int firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber, encryptedNumber;
		
		int num1;
		int num2;
		int num3;
		int num4;
		int key = rand.nextInt(10); //I chose 10 to be inclusive to 9
		
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
		
		System.out.println("Your key is:" + key);
		
		
		if (firstNumber > 19) //is there a way to do this for all of them together instead of separately?
		{ //is it best system practice to have this be blank before and after the grouping?
			System.out.println("Please read directions ad try again!");
			System.exit(0);
		}
		 
	
		total = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
		
		//Split number to digits 0 through 9
		
		while (total>0)
		{
			num1 = total/10;
			num2 = total%10; //I am not sure if I did this right...
		}
		num1 = total/10;
		num2 = total%10;
		num3 = (num1 + key)%10; //what does it mean when num1 hasn't been initialized? I don't want to assign a number above so should I use string
		num4 = (num2 + key)%10;
		
		encryptedNumber = num3 + num4;
		
		System.out.println(total); // might have to delete this line later
		
		System.out.println("Encrypted Number is:" + encryptedNumber);
		
	}

}
