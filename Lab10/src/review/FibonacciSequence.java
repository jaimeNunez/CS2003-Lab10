package review;


public class FibonacciSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 1;
		int sumOfOddValuedTerms = 1;

		
		
		//Important Note!!
		//This loop finds the sum of the all the terms with odd values inside the fibonacci sequence
		//This is not the same as finding the sum of the terms with an odd-valued index inside the sequence
		while(i < 2000000000 | j < 2000000000) {
			i = i + j;
			if(i < 2000000000) {
				if(i%2 == 1) {
					sumOfOddValuedTerms = i + sumOfOddValuedTerms;
				}
			}
			
			j = j + i;
			if(j < 2000000000) {
				if(j%2 == 1) {
					sumOfOddValuedTerms = j + sumOfOddValuedTerms;
				}
			}
		}
		System.out.println("The sum of odd-valued terms in the fibonacci sequence with numbers less than 2 billion is: " + sumOfOddValuedTerms);
		
		
	}

}
