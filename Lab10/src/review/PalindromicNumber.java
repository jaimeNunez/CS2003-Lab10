//Jaime Nunez
//Lab 10
package review;


public class PalindromicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numOfDigits = 4;
		int largestPalindrome = 0;
		int productI = 0;
		int productJ = 0;


		for(int i = 1000; i <= 9999; i++) {
			for(int j = 1000; j <= 9999; j++) {
				int currentMultiplication = i*j;
				String testValue = String.valueOf(currentMultiplication);
				if(isaPalindrome(testValue)) {
					largestPalindrome = currentMultiplication;
					productI = i;
					productJ = j;
				}
			}
		}
		
		System.out.println("The largest palindromic number that is made from the product of two " + numOfDigits + " digit numbers is: " + largestPalindrome + ". It is made by " + productI + " x " + productJ); 
	}
	
	//Reusing my palindrome checker function from lab 5
	public static boolean isaPalindrome(String expression)
	{
		//determine the length of the string expression
		int strLength = expression.length();
		//grab the first character in the expression
		char firstValueInString = expression.charAt(0);
		//grab the last character in the expression
		char lastValueInString = expression.charAt(expression.length()-1);
		//check the base case
		if(strLength <= 1)
		{
			return true;
		}
		//check if it is not a palindrome
		else if(firstValueInString != lastValueInString)
		{
			return false;
		}
		//otherwise call the recursive function
		else 
		{
			//if the expression length has at least 3 characters
			if(strLength > 2)
			{
				return isaPalindrome(expression.substring((1), strLength-1));
			}
			//if the expression length only has two characters left
			else
			{
				return isaPalindrome(expression.substring((0), strLength-1));

			}
		}
	}
	


}