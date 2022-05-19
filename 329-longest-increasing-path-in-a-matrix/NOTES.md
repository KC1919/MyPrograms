the intuition behind this approach is that,
​
We can explore all possible paths from a cell.
​
And get answers from all the 4 directions.
Whichever direction returns the maximum length path.
​
Add 1 to it(adding own cell to the returned path)
​
Store the current cell's result in the dp matrix.
Now this result would be helpful, if any cell reaches this cell while exploring its paths,
​
So instead of recalculating the results for the reached cell, we can simply return the result stored in our dp matrix.
​
So this would be very time efficient.
​
We make call in all 4 directions one by one, and we go only to those cell, which have value greater than our cell.