import java.util.Random;
import java.util.Scanner;

public class Cipher {

	public static void main(String[] args) {
	
	System.out.println("Programming Fundamentals");
	System.out.println("Name: Dan Hannigan");
	System.out.println("PROGRAMMING ASSIGNMENT 1");

	System.out.println("\nWelcome to the Cipher program.");
	System.out.println("Please enter 5 numbers between 0 and 19");

			Scanner scan = new Scanner (System.in); //setting up for user's input
			
			System.out.print("1st Number: ");
			String first = scan.nextLine();
			System.out.print("2nd Number: ");
			String second = scan.nextLine();
			System.out.print("3rd Number: ");
			String third = scan.nextLine();
			System.out.print("4th Number: ");
			String fourth = scan.nextLine();
			System.out.print("5th Number: ");
			String fifth = scan.nextLine();		
			
	int total = (Integer.parseInt(first) + Integer.parseInt(second) + Integer.parseInt(third) + Integer.parseInt(fourth) + Integer.parseInt(fifth));
		//totaling the user's inputs
		
	System.out.println("\nTotal = " + total);
		
		int firstdigit = (total/10); //separating the user's total number
		int seconddigit= (total%10);
		
	Random gen = new Random(); //setting up key
	int key = gen.nextInt(9);
	System.out.println("Your random key is " + key);
		
		int firstnew = (firstdigit + key) % 10;
		int secondnew = (seconddigit + key) % 10;
		
	System.out.println("Your encoded number is " + firstnew + secondnew);
		
	}

}
