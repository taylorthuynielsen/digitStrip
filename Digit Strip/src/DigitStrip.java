import java.util.Arrays;
import java.util.Scanner;

public class DigitStrip
	{

		public static void main(String[] args)
			{
				//challengeOne();
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
			System.out.println(counter);
			
			int array[]=new int[counter];
			for (int i = 0; i<array.length; i++)
				{
					int strippedDigit = number%10;
					array[i] = strippedDigit; 
					number = number/10;
				}
			System.out.println(Arrays.toString(array));
			
			int oddCounter = 0;
			for (int i = 0; i<array.length; i++)
				{
					if ((array[i]%2)!=0)
						{
							oddCounter++;
						}
					else
						{
							//oddCounter = oddCounter + 0; 
						}
				}
			System.out.println(oddCounter);
			
			int sum = 0;
			for (int i = 0; i<array.length; i++)
				{
					sum = sum + array[i];
				}
			System.out.println(sum);
		}
	}
