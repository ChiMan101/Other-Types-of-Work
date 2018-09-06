#Python small exercise questions
#Help you getting familiar with Python syntax

#Grading:
#Complete HW + correct results: 100%
#Complete HW + minor errors: 75%
#Incomplete HW (missing small amount of questions), or Complete but with larger errors: 50%
#Incomplete HW (missing more than half of questions): 25%
#No submission: 0%
#Late work is half of your original credit

#Please follow the required input/output and function names

'''
 1. Input: Count
 Output: print Count number of "hello":
            1th hello
           2th hello...
 IMPORTANT: copy to visualizer, observe the behavior
'''
myCount = input('Enter a number: ')
myCount = int(myCount)
def easy_hello_loop1_for(Count):
    for x in range(Count):
        x+=1
        print("%sth, hello"%(x))
easy_hello_loop1_for(myCount)

'''
2.Input: number x,y
 Output: return the smaller value of the two
 Do it by yourself, no system calls like min()
'''
num1 = input('Enter a number: ')
num2 = input('Enter another number: ')

num1 = int(num1)
num2 = int(num2)

def smaller_value(x,y):
    if(x > y):
        print ("%d is a smaller value then %d"% (y,x))
    elif(y > x):
        print ("%d is a smaller value then %d"% (x,y))
    else:
        print ("same size")

smaller_value(num1,num2)
    
'''
3. Do not use len(). Write a function to calculate how many elements do you have in your list, and return it
'''
mylist = [1,2,3]

def my_len(lis):
    icounter = 0
    for z in lis:
        icounter+=1
    print ("%d elements in list "% (icounter))

my_len(mylist)

'''
4. input: a list with small strings that has 2 letters, 3 letters, or 4 letters
output: return 3 lists, Letter2, Letter3, Letter4 containing small strings
Sample:
input list: ['rt','asdf','ton','er','user']
will give
    Letter2=['rt','er']
    Letter3=['ton']
    Letter4=['asdf','user']
You can use len() in this question.
'''
mylist = []
#gets input frm user
str1 = input('Enter a string: ')
mylist.append(str1)
str2 = input('Enter a string: ')
mylist.append(str2)
str3 = input('Enter a string: ')
mylist.append(str3)
str4 = input('Enter a string: ')
mylist.append(str4)
str5 = input('Enter a string: ')
mylist.append(str5)

#print(mylist)

def cate_letters(LongStr):
    #defines the arrays we will be spliting the list into
    Letter2 = []
    Letter3 = []
    Letter4 = []
    
    #loops through the list to find whether a string is 2, 3, or 4 chars long and adds the item to list based on len
    for x in LongStr:
        if len(x) == 2:
            Letter2.append(x);
        elif len(x) == 3:
            Letter3.append(x);
        elif len(x) == 4:
            Letter4.append(x);
        else:
            print("Not a valid parameter.")

    #prints out the lists
    print (Letter2)
    print (Letter3)
    print (Letter4)
#calls function    
cate_letters(mylist)

    

        
    

'''
5. input: a string with character in it, a string with numbers in it
output: go through the two strings together, print out elements by index
format "the elements at index __ from string1 is __, from string2 is ___"
'''
#gets input
strWithChar = input('Enter a string: ')
strWithNum = input('Enter a string: ')


#must be the same length in strings
def two_strings(str1,str2):
    icounter = 0
    for x in zip(str1,str2):
        print ("the elements at index %s from string1 is %s, from string2 is %s"% (icounter,str1[icounter],str2[icounter]))
        icounter+=1
    
two_strings(strWithChar,strWithNum)
'''
6. input: a string with character in it, a string with numbers in it
output: go through the two strings together. At index i, if the number in str2 is even, put the letter in str1 into evenStr
if the number is odd, put the letter into oddStr. Return the even/odd strings
Sample: "helloworld" "2435232399"
gives evenStr="heoo" oddStr="llwrld"
'''
#gets input
strWithChar = input('Enter a string: ')
strWithNum = input('Enter a string: ')


#must be the same length in strings
def two_strings(str1,str2):
    oddL = ''
    evenL = ''
    icounter = 0
    for x,y in zip(str1,str2):
            num = int(str2[icounter])
            if num%2 == 0 :
                evenL += str1[icounter]
            elif num%2 != 0:
                oddL += str1[icounter]
            icounter+=1
    print ("Odd String: '%s'"% (oddL))
    print ("Even String: '%s'"% (evenL))
                
            
two_strings(strWithChar, strWithNum)        

'''
7.
The number 6 is a truly great number. Given two int values, a and b, return True
if either one is 6. Or if their sum or difference is 6.
Note: the function abs(num) computes the absolute value of a number.

love6(6, 4) returns True
love6(4, 5) returns False
love6(1, 5) returns True
'''
aInt = input("Input a Integer Value.")
bInt = input("Input another Integer Value.")

def love6(a,b):
    a = int(a)
    b = int(b)
    if(a == 6 or b == 6):
        return True;
    elif((a+b)== 6 or (a-b)==6 or (b-a)==6):
        return True;
    else:
        return False;

result = love6(aInt, bInt)

if(result == True):
    print("Your numbers either had a 6 in it or it had a sum or difference of 6!")
else:
    print("Your numbers did not have a 6 in it or a sum or difference of 6.")


'''
########
#8. ISBN number

#As you know, every book has an unique ISBN number (International Standard Book Number).
#It is a 10-digit (or 13) code that uniquely specifies a book. Since this number is long, the right most digit is actually a "checksum"
#to roughly check if all the digits are correct (not mis-typed etc.) and forming a legit ISBN number. (checksum is also used in other places, like credit card number.)
#The rule is: when adding all the (10 numbers * its position (rightmost be position 1, leftmost be 10)) together, the sum should be divisible by 11.
#For example: ISBN 020131452-5 is legit since:
#               (0*10 + 2*9 + 0*8 + 1*7 + 3*6 + 1*5 + 4*4 + 5*3 + 2*2 + 5*1)%11 = 88%11 = 0 the sum 88 is divisible by 11
#In fact, the cool thing is that the checksum (rightmost 5) is the only single digit number that can satisfy this rule. In other words, if you know the first
#9 digit, you can calculate the checksum (last digit). In this problem, you will be calculte the checksum of an ISBN number.
#########
'''
'''
Helper function 1: check_legit_ISBN
Input: a list with 10 single digit number in it
Output: return "Legit" if the 10 digits form a legit ISBN number
        return "Not Legit" otherwise

Sample: [0,2,0,1,3,1,4,5,2,5] should return "Legit"
        [0,2,0,1,3,1,4,5,2,3] should return "Not Legit"

'''
#def check_legit_ISBN(ISBNLis):
    

'''
Helper func 2: format output
input: a list with 10 numbers in it
output: format it to the correct ISBN format and return it
Sample:
[0,2,0,1,3,1,4,5,2,5] will become: "ISBN 020131452-5"
'''
#def format_ISBN(ISBNLis):

'''
Helper func 3: checksum_ISBN
Input: a list with 9 single digit number in it (first 9 digit in ISBN)
Output: print out: "The correct checksum digit is:__. Now we have a legit ISBN: _____"
Hint: just loop through 0-9, test every one with helper func1 to find out the one checksum that forms a legit ISBN
with the correct ISBN in lis (10 numbers), call helper func2 to format it correctly. Then print the final result.
'''
#def checksum_ISBN(partISBN):


'''
Main Func: Generate a ISBN by:
---add 9 random nunmbers into a list
---call helper func 3 to find the checksum

---Generate 10 good ISBN number with one function call
'''
#def generate_ten_ISBN():




