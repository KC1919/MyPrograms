The logic behind this approach is that
​
As we have to choose numbers in range from 1 to 9 only.
And we can choose only K numbers.
​
So we consider K spots.
​
And at each spot any number from 1 to 9 can come.
And for the next spot the any number after the previous spot number can come.
So as to avoid generation of duplicate combinations.
​
And we also add the chosen number to the sum, and as soon as K numbers
are picked, we check the sum of those numbers, if its equal to th target.
​
We add that combination to our list of answer.