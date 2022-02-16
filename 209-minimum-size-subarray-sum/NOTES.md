We keep on adding element to the sum, till it becomes equal or greater than the target.
​
If this condition is met, then we calculate the span of the array, which is equal to K.
​
And then we delete the 'jth' element from the start of the window, because we will move further that would increase the sum.
So to focus on the getting again the target we should keepour sum close to the target.
​
We keep doing this, and when the loop ends, we have the minimum size window wjose sum is equal to K.