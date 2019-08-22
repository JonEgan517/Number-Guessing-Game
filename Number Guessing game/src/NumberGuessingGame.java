import java.util.Scanner;

public class NumberGuessingGame 
{
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = userInput.nextLine();
		System.out.println("Hi " + name);
		
		int randomNumber = 0;
		int difficultyEasy = 1;
		int difficultyMedium = 2;
		int difficultyHard = 3;
		System.out.println("What difficulty do you want to play?" );
		randomNumber = userInput.nextInt();
		
		if(randomNumber == difficultyEasy)
		{
			randomNumber = (int)(Math.random()*10 +1);
			System.out.println("You chose Easy.");
		}
		
		else if(randomNumber == difficulyMedium)
		{
			
		}
		
		boolean stillGuessing = true;
		int counter = 0;
		System.out.println("Guess a number.");	
		
		while(stillGuessing = true)
		{
			int guess = userInput.nextInt();
			
			if(guess > randomNumber)
			{
				System.out.println("Too high! Guess again");
			}
		
			else if(guess < randomNumber)
			{
				System.out.println("Too low! Guess again");
			}
			
			else
			{
				System.out.println("Correct");
			}
			
			counter = counter+1;
			System.out.println("Total of tries: " + counter);
		}
		
		stillGuessing = false;
	}
}
