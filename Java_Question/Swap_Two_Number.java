/*
  Problem Statement
Suggest Edit
You are given two numbers 'a' and 'b' as input.

You must swap the values of 'a' and 'b'.

For Example:
Input: 
'a' = 8, 'b' = 5

Output:
5 8

Explanation:
Initially, the value of 'a' and 'b' is 8 and 5, respectively.

After swapping, the value of 'a' is 5, and the value of 'b' is 8.
Detailed explanation ( Input/output format, Notes, Images )
keyboard_arrow_down
Sample Input 1:
1 2 
Sample Output 1:
2 1
Explanation For Sample Input 1:
The output of the above test case is 2 1.
Sample Input 2:
5 6
Sample Output 2:
6 5
Explanation For Sample Input 2:
The output of the above test case is  6 5.
Constraints:
-10^5 <= 'a', 'b' <= 10 ^ 5

Time Limit: 1 sec

 */

package Java_Question;

import java.util.Scanner;

public class Swap_Two_Number {
    // Implementation
    public static void swapNumber(int[] a, int[] b) {
        int t = a[0];
        a[0] = b[0];
        b[0] = t;
    }

    // Declaration
    public static void main(String[] args) {
        // Initialization size for arrays, which can store only one integer each
        int[] a = new int[1];
        int[] b = new int[1];

        // Adding Scanner Class from java.util package
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        a[0] = input.nextInt();
        b[0] = input.nextInt();

        swapNumber(a, b);

        // System.out.println(a[],b[]);
        // Using printf to print both a and b variables on the same line
        System.out.printf("%d,%d%n", a[0], b[0]);

        // Close the Scanner
        input.close();
    }
}

