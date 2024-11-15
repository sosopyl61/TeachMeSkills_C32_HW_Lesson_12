# The following tasks:
1. Write a program that the passed string is a hex code to describe the color.
For example, when you enter the value #8b2323 into the program, the program should return Yes.

2. Write a program that will check that the entered link is valid.
For example, when analyzing a link like this https://teachmeskills.by/kursy/programmirovaniya-online, the program should return that the link is valid.
and when you enter tcp://teachmeskills.by/kursy/programmirovaniya-online - the program should return that the link is not valid (the link starts with neither http nor https).

3. The user enters any number greater than 0.
The program must add the digits that make up this number.
For example, if 349 was entered, the program should display the number 16, so
like 3 + 4 + 9 = 16.

4. Write a program to find a greater common divisor using Euclidean algorithm.

5. The user makes a contribution in the amount of a ruble for a period of years at 10% per annum
(every year the size of his contribution increases by 10%. This money is added to
the amount of the deposit, and there will also be interest on them next year).
Write a bank program that takes arguments a and years and returns
the amount that will be in the user's account.

6. Rotate an array of n elements to the right by k steps.
For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

7. Given two words (beginning and end) and a dictionary, find the length of the shortest
sequence of transformations from start to finish, in which at one time
You can only change one letter.
And every word in between must exist in the dictionary.
For example, given:
start = "hit"
end = "cog"
dict = ["hot", "dot", "dog", "lot", "log"]
One shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog"
The program should return length 5.

8. Given an array of integers, find two numbers that add up to the given number.
The twoSum function should return the indices of two numbers so that they add up
to the target number.
For example:
Input: numbers={2, 7, 11, 15}, target=9.
Output: index1=0, index2=1.
