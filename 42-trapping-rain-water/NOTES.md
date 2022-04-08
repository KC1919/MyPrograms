The intuition behing this approach is that,
​
we take two pointers one left and other right.
​
left is kept at 0th index and right is kept at last index.
​
we also take two variables
​
leftMax=to store the height of left tallest bar till the left pointer.
​
rightMax= to store the height of the right tallest bar till the right pointer.
​
1) We check if the left bar is smaller in height than the rightMax: then we have 2 conditions,
​
i) if the left bar is also smaller than the leftMax, this means there is a cavity that can be filled with water, so we calculate it by substracting the height of current bar from the leftMax and add it to the result.
​
ii) if the left bar is greater than or equal to the leftMax, then we update the leftMax to the current bars height, since now it becomes the tallest left bar for the elements ahead of it.
​
If condition 1 is false,
then it means the curent bar is taller than the rightMax,then we have 2 conditions,
​
i) if the right bar is also smaller than the rightMax, this means there is a cavity that can be filled with water, so we calculate it by substracting the height of current bar from the rightMax and add it to the result.
​
ii) if the right bar is greater than or equal to the rightMax, then we update the rightMax to the current bars height, since now it becomes the tallest right bar for the elements ahead of it.
​
The loop runs till left pointer is smaller than the right pointer.
​
And finally we return the result.