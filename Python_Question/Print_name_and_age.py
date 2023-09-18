'''
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

'''

# Input value of the first variable will be taken
val1 = input()

# Input value of the Second variable will be taken 
val2 = input()
val2 = int(val2)

# Printing out the desired output 
# Here f is the formatted String literals
print("The name of the person is {} and the age is {}.".format(val1,str(val2)))
