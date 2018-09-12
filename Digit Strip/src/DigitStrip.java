import java.util.Arrays;
import java.util.Scanner;

public class DigitStrip
	{

		public static void main(String[] args)
			{
				//challengeOne();
				challengeTwo();
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
		
		public static void challengeTwo()
		{
			Scanner userInput = new Scanner(System.in); 
			System.out.println("Enter a number of any size.");
			int number = userInput.nextInt(); 
			boolean numberEqualsZero = true;
			
		}
	}
