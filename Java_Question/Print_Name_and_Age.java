
/*
  Problem Statement

Take the person's name and age and print out the name and age as 
specified in the output format.

Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
Ali
30
Sample Output 1:
The name of the person is Ali and the age is 30.
Explanation Of Sample Input 1:
The input name is Ali and the input age is 30 which is printed in the specified format.

 */

package Java_Question;

import java.util.Scanner;
class Solution{
 public static void main(String arg[]){
   Scanner input = new Scanner(System.in);
   String name=input.nextLine();
   int age=input.nextInt();
   System.out.println("The name of the person is "+name+" and the age is "+age+".");
}
}