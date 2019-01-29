
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed Mohamed
 */

/*

Assignment Name: Assignment 2

Instructor: Dr.Cheng Thao. 

Written By: Mohamed Mohamed.

Course: CSC 422- Software Engineering Class

Written: 1/26/2019.

Revised: 1/27/2019.

Version #3

*/

public class GuessGame { // This is our GuessGame class
   
   public static void main(String[] args) {// Main method for our java program.
       
	Scanner input = new Scanner(System.in); //Reads from keyboard.
	
       int number = (int) (Math.random() * 99 + 1); //  Declaring the number and using it with math.random class
		
       int guess; // declaring guess variable as int
       
      // Using a do while loop to iterate the multiple guess the uses inputs.
	do {
		System.out.print("I'm thinking of a number between 0-100. "); // Displays the user's question about  thinking a number between 0-20.

		System.out.print("What is the number? "); //  Display to the user about which number they have inputted for our guessing game.

		guess = input.nextInt();
				
		if(guess == number)  // if guess is correct the the user gets it correct.
			
	             System.out.println("You Got it!");
			
		else if (guess < number) // if the guess is less than the number then the it will be too low and would have to try again.
			
                    System.out.println("Nope. " + "Too Low. " + "Try Again: " + guess);

         else if (guess > number) // if the guess is greater then it will be too high and the user will have to try again.
			
                    System.out.println("Nope. " + "Too High. "+ "Try Again: " + guess);
	
       } while (guess != number);
    
     // End of do while loop.
}

}
        