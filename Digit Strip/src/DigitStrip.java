import java.util.Scanner;

public class DigitStrip
	{

		public static void main(String[] args)
			{
				//challengeOne();
				test();
			}
		
		public static void challengeOne()
		{
			int sizeSixArray[] = new int[6];
			Scanner userInput = new Scanner(System.in);
			System.out.println("Input a six digit number.");
			int number = userInput.nextInt();
		}
		
		public static void test()
		{
			int number = 237; 
			int lastDigit = 237%10;
			int secondDigit = (number/10)%10;
			int firstDigit = secondDigit%10;
			System.out.println(secondDigit);
		}
	}
