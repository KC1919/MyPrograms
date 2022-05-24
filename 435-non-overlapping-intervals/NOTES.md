the main login here is that,
​
first sort the intervals on the basis of their start time.
​
Then take start and end time of the 1st interval..
​
then start iterating the intervals from the 2nd interval.
​
check if the ith interval's start time is less than the end time of the previous interval.
​
so increment the remove count by 1.
​
and update the end time of the interval with the minimum of the two end time's of the current and the previous interval.
​
Minimum because we need to minimize the removal of intervals,
since if we take the maximum end tiem between the two intervals then it would cover greater number of intervals ahead of it so we will have to remove more number of intervals.
​
But we have to minimize the removal, so we take the minimum end time between the two, because it will minimize the chance of covering othe intervals ahead of it.