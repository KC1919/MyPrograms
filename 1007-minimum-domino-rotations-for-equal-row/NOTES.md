First we took, two candidates.
That will always be the 1st candidate in each array.(top and bot)
​
and we took their starting count=1, in two variables one for each.
​
The winning candidates would always be from either 1st domino of top or 1st domino of bot.
Since their total count has to be equal to the length of the array.
So they should be present at all the index of either top array or bot array after swapping.
​
now we started to loop from the 1st index.
​
So we check if the ith position in both the array if it matches with either of the candidate
we increment that candidates count accordingly.