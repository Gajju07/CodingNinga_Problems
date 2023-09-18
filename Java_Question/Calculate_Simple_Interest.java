/*
Problem Statement
Suggest Edit
Take the principal amount, rate of interest, and the time period as input and calculate the Simple Interest.
Note: Return answer as Floor integer value.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
2000
2.2
4
Sample Output 1:
176
Explanation Of Sample Input 1:
The input is principal=2000, rate=2.2 and time=4.
So Simple interest=Principal*rate*time/100 hence 
answer is 2000*2.2*4/100=176

 */

package Java_Question;

import java.util.Scanner; 

class Solution {
	
	public static double simpleInterestCalculation(double principal, double rate, double time){
		double result = (principal * rate * time) / 100;	
		return result;
	}
	
	public static void main(String args[]) {
		// Adding Scanner class from java.util.*
		// Taking three input from the user 
		Scanner input = new Scanner(System.in);
		
		// First input for principal value
		double principal = input.nextDouble();
		
		// Second input for rate value
		double rate = input.nextDouble();
		
		// Third input for time value
		double time = input.nextDouble();

		System.out.println((int)simpleInterestCalculation(principal, rate, time));
	}
}

