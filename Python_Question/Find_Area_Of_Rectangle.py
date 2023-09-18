''' 

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

'''

# Solution

# Write a code a here 
length, breadth = map(int,input().split())

result = length * breadth
print(result)