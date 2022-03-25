we make a pair class of difference value and index.
​
then for every ith person, we calculate the cost difference of flying him to the city A and flying him to the city B, and we make Pair of difference value and the index of the ith person.
​
Then we sort this pair class array, on the basis of difference values, in ascending order.
​
So the first N people will go to city B.
And the rest N people will go to city A.
​
Because we have calculated the difference as (Cost B - Cost A). So a larger difference in cost for a person, means sending him to city B would be costly.
​
So as we sorted the array based on the difference in cost.
So the less difference wouldcome first after sorting, that means that those people could be sent to city B as the cost of B would not be as high as the sending people that have large difference.
​
So we first send N people to city B.
Then the rest N in sorted means they have large difference in Cost, that means that cost of sending them to City A is less, that is why difference is more (i.e Cost B - Cost A).
​
So we send the rest N people to city A.