'''
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

'''

from os import *
from sys import *
from collections import *
from math import *

def swap(a, b):
    # Create a new tuple with the swapped values
    swapped_tuple = (b, a)
    return swapped_tuple

# Taking input from the user
a, b = input().split()
a = int(a)
b = int(b)

# Call the swap function
swapped_tuple = swap(a, b)

# Print the swapped values in the tuple
print(swapped_tuple)
