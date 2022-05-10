The logic behind this approach is that
​
As we have to choose numbers in range from 1 to 9 only.
And we can choose only K numbers.
​
So we consider K spots.
​
And at each spot any number from 1 to 9 can come.
So we loop from the next of previous number till 9.
And for the next spot the any number after the previous spot number can come.
So as to avoid generation of duplicate combinations.
​
​
And we also add the chosen number to the sum, and as soon as K numbers
are picked, we check the sum of those numbers, if its equal to th target.
​
We add that combination to our list of answer.
​
If tthe combination is not valid, means the sum is not eqaul to the target, then we backtrack, and remove the chosen number for the ith spot, and now chose some other number for that spot and check if it makes a valid combination.
​
We do this for all the spots.