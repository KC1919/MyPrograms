the main intuition behind this approach is that,
​
we have a target, that we need to achive using minimum number of coins.
​
So we can break down our problem,
​
We have infinite coins and we can choose any  coin any number of times.
​
So every time we have our target with us, we have the option to choose any coin.
​
When we choose a coin that we are going to use, we check if the target amount is greater than the value of that coin.
If this condition is true, we deduct the amount equal to the value of that coin from the target, and make a call to form the remaining target.
​
So this is how, we try to accomplish smaller and smaller targets first that in turn helps to make the result for the bigger target.
​
We basically took an dp array of size equal to the amount.
​
this dp array stores at the amount'th index the minimum number of coins required to make that amount.
​
So suppose we are standing at a target, and we took a coin used it, and now the remaining target is to be formed.
​
Now we see the remaining target has already been formed before, so we are again reaching that target, so instead of recalculating its result we return the stored result in the amount'th index of the dp array.
​
This is how we save out time by recalculating the same target amount every time we reach that target.
​
So we explore all the possible ways to form the target and the way that return the minimum number of coins to form the target, we store that result in the dp array.