import java.util.Arrays;
import java.util.Scanner;

public class DigitStrip
	{

		public static void main(String[] args)
			{
				challengeOne();
				challengesTwoToFive();
			}
		
		public static void challengeOne()
		{
			int array[] = new int[6];
			Scanner userInput = new Scanner(System.in);
			System.out.println("Input a six digit number.");
			int number = userInput.nextInt();
			for (int i = 0; i<array.length; i++)
				{
					int strippedDigit = number%10;
					array[i] = strippedDigit;
					number = number/10;
				}
				System.out.println(Arrays.toString(array));
		}
		
		public static void challengesTwoToFive()
		{
			Scanner userInput = new Scanner(System.in); 
			System.out.println("Enter a number of any size.");
			int number = userInput.nextInt();
			int numberChallengeTwo = number;
			boolean numberEqualsZero = true;
			int counter = 0;
			do
				{
					if (numberChallengeTwo/10>0)
						{
							int strippedDigit = numberChallengeTwo%10;
							numberChallengeTwo = numberChallengeTwo/10; 
							counter++;
					
						}
					else if(numberChallengeTwo/10==0)
						{
							counter++;
							numberEqualsZero=false;
						}
				}
			while(numberEqualsZero);
			System.out.println("You have " + counter + " digits in your number.");
			
			int array[]=new int[counter];
			for (int i = 0; i<array.length; i++)
				{
					int strippedDigit = number%10;
					array[i] = strippedDigit; 
					number = number/10;
				}
			
			
			int oddCounter = 0;
			for (int i = 0; i<array.length; i++)
				{
					if ((array[i]%2)!=0)
						{
							oddCounter++;
						}
					else
						{
							oddCounter = oddCounter + 0; 
						}
				}
			if (oddCounter>1)
				{
			System.out.println("You have " + oddCounter + " odd digits in your number.");
				}
			else if (oddCounter==1) 
				{
				System.out.println("You have one odd digit in your number.");
				}
			
			int sum = 0;
			for (int i = 0; i<array.length; i++)
				{
					sum = sum + array[i];
				}
			System.out.println("The sum of your number is " + sum + ".");
			
			int sumLastDigit = sum%10; 
			int rounded = 0;
			if (sum>=10)
				{
					if (sumLastDigit<5)
						{
							rounded = sum - sumLastDigit; 
						}
			
					else if (sumLastDigit>=5)
						{
							rounded = sum + sumLastDigit;
						}
					else 
						{
							rounded = rounded; 
						}
			
			
				}
			
			else if (sum<10)
				{
					if (sum<5)
						{
							rounded = 0; 
						}
					else if (sum>=5)
						{
							rounded = 10; 
						}
				}
				System.out.println("The rounded version of your sum is " + rounded + ".");
		}
	}
