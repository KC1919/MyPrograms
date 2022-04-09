The intuition behind this O(1) space approach is that.
​
We used the akadanes algorithm.
​
The logic is that, first we find the normal maximum sum subarray and store in maxSum variable.
​
Then we find minimum sum subarray and store in minSum variable.
​
Then we find normal sum of all the elements of the array.
​
Then we calculate the sum, which will be left after deleting the minimum subarray sum from the sum of all elements.
​
And this sum will give us the circular contiguous subarray sum.
​
Now we comapre this circular subarray sum with out normal maxSum.
​
Which ever is greater we return that.
​
​