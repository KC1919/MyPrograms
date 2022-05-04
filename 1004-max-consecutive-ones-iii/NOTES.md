We start iterating from the 1st element of the array.
​
We check if the element is 1, then we simply increment the count by 1.
​
If the element is 0, then we check if we have the option to flip 0 to make it 1.
​
If we can flip we flip it, and increment the count of 0(who are part of the subarray) by 1.
​
Then we check if the zeros fipped are not greater than the limit of the flips.
​
We check that by the count of 0's we have in our subarray.
If the count is greater than the limit,
​
Then we start from the start of the subarray(jth index) and we keep removing elements till the count of 0's becomes less than or equal to the limit of flips.
​
And whenever we increment the count by 1, we update our max.
​
Finally when the whole array is traversed we have the maximum length of subarray of 1's that can be made by flipping at most k 0's.