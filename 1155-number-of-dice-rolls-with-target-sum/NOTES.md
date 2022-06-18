the main logic behind this problem is that,
​
**we have m choices for for each of the n dices**
​
now we develop a recurrence relation,
​
we choose a dice and we choose a number from 1 to k from the ith dice
​
like this we have 1 to k choices for all the n dices.
​
so we choose any number between 1 to k and reduce our target by the chosen number,
​
so now we make call to the rest of the dices to make up the ramining target.
​
​
So our dp table stores these states only, that is, the dice we are standing at and the target sum that is remaining forms a unique state, that is the overlapping problem.
​
Suppose we have k=4 and n=3 and target=12
​
now we chose 1 from the 0th dice and make call to the 1th dice with target=(12-1=11)
​
so now we choose 1 from the 1th dice and make call to the next dice with
target=(11-1=10)
​
Like this if we form the recursion tree we will find the overlapping subproblems
​
that can be optimized using the current dice and the remaining target sum left