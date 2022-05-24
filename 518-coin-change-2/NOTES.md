the intuition behind this problem is that, this is a 2d DP problem.
​
In this we have to make a DP matrix, to store the index(coins or denominations) in the rows
and amount from 0 to the target in the columns.
​
And the cell (i,j) tells the amount that is at jth column, can it be made by using the coins from ith position till end.
​
So this saves the answer.
And whenever this index and target is reached by some other target so we return the answer stored(that is the number of ways to make jth amount using coins from ith position till end).
​
We have a target and we have coins.
​
So we have options to choose coins from the available coins. and each coin can be chosen infinite number of times.
​
So to prevent permutations we choose coins starting from ith and till end.
​