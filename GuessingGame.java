package coding.troll;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Hello Welcome to the Guessing Game!!!\n"
				+ "The object of the game is to guess a number between 1 and 10,000");
		int guess = userInput.nextInt();
		Random rand = new Random();
		int num = rand.nextInt(10001);
		int count = 0;
		
		
		while(guess != num) {
			System.out.println("Please enter your guess! ");
			guess = userInput.nextInt();
			if(guess < num) {
				System.out.println("Guess is too low, guess again ");
				guess = userInput.nextInt();
			}else if(guess > num) {
				System.out.println("Guess is too high, guess again ");
				guess = userInput.nextInt();
			}else {
				System.out.println("You guessed right! You won!!!");
			}
			count++;
			
		}
		System.out.println("It took you " + count + " guesses!!!");

	}

}
