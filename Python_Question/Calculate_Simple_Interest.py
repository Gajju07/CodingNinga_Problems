'''
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

'''

from os import *
from sys import *
from collections import *
from math import *

# Your code goes here
def simple_Interest_Calculation():
    principal = int(input())
    rate = float(input())
    time = int(input())
    result = (principal * rate * time) / 100
    return result

# Call the function and print the result
print(int(simple_Interest_Calculation()))
