package Java_Question;

/*
 Problem Statement
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= l, B <=10^2
Sample Input 1
4 20
Sample Output 1:
80
Explanation Of Sample Input 1:
Length of the rectangle is 4 and breadth is 20. 
Hence the area of the rectangle is (length*breadth). 
So the answer is 4*20=80.

 */

//  Solution

import java.util.InputMismatchException;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        try {
            // System.out.print("Enter the first integer: ");
            int a = input.nextInt();

            // System.out.print("Enter the second integer: ");
            int b = input.nextInt();

            int c = a * b;
            System.out.println(c);
            // System.out.println("Result: " + c);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
        } finally {
            input.close();
        }
    }
}
