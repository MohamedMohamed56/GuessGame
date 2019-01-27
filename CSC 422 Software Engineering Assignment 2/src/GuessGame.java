/*
 
 Assignment Name: Assignment 2

 Instructor: Dr.Cheng Thao. 

 Written By: Mohamed Mohamed.

 Course: CSC 422- Software Engineering Class

 Written: 1/26/2019.

 Revised: 1/27/2019.
 
 Version #1
 
*/

import java.util.Scanner; // Importing our Java Scanner class. 

public class GuessGame { // This is our GuessGame class.

	public static void main(String[] args) {// Main method for our java program.
	 
	Scanner input = new Scanner(System.in); //Reads from keyboard.
	
	int number = 1 + (int) (Math.random() * 20); // Using  Math.Random to set the randomNumber
	
	int guess = 0; // Guess is set to 0.
	
	int count = 0; //Count is set to 0.
		
    System.out.print("I'm thinking of a number between 0-20. "); // Displays the user's question about  thinking a number between 0-20.
	   
	System.out.print("What is the number? "); //  Display to the user about which number they have inputted for our guessing game.
	
	// Using while loop to iterate through the guess of the user
	
	while(guess != number) {
		 
		 guess = input.nextInt();
		 
		 count++;
		 
		 if(guess > number) { // checking if guess is greater than randomNumber
			 
		   System.out.print("Nope " + "The number is " + number); // Displays the guess as wrong if the user inputs the wrong guess.
			 
		 }
		 
		 else if(guess < number ) { // checking if guess is less than randomNumber.
			  
			 System.out.print("Yes"); // Displays the guest a correct if the user inputs the correct guess.
		 }
	 }
	
	}
}