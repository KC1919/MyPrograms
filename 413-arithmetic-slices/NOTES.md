we start from the 3rd element of the array. We find the difference with its previous element,
if the current difference is equal to the difference of the previous element, we increment the length of the subarray by 1.
If the length of the subarray becomes 3, then we increment the count by 1.
If the length of the subarray becomes greater than 3 then we increment the count by
(1+dp[i].len-3).
​
If at some point the subarray breaks, means the current difference is not equal to the previous difference, it means start point of a new subarray, so we store the difference with length of the subarray as 2, because its consists of 2 elements.