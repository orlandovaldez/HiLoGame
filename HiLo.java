import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String playAgain = "";
		do {
			//Create a random number for the user to guess
			int theNumber = (int) (Math.random() * 100 + 1);	//program generates random number an stores it into variable for comparison later on
			//System.out.println(theNumber);
			int guess = 0;
			while (guess != theNumber) {	//while loop to give user multiple chances to guess the correct number if guess is incorrect				System.out.println("Guess a number between 1 and 100: ");	//ask user for input
				System.out.println("Guess a number between 1 and 100: ");
				guess = scan.nextInt(); 	//accept user input and store in variable
				if (guess < theNumber)
					System.out.println(guess + " is too low. Try again.");
				else if (guess > theNumber)
					System.out.println(guess + " is too high. Try again.");
				else 
					System.out.println(guess + " is correct. You win!");
		}	//End of while loop for guessing 
			System.out.println("Would you like to play again(y/n)?");
			playAgain = scan.next();		
		}while(playAgain.equalsIgnoreCase("y"));
		System.out.println("Thank you for playing! Goodbye!");
		scan.close();
	}

}
