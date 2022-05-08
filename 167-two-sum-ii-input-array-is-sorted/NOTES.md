Used the 2-ponter approach.
​
As the array is sorted,
​
we keep a left pointer at the start of array, and a right pointer at the end of the array.
​
Then we sum the elements at the two pointers.
if the sum is greaterthan the target, that measn we need to reduce the sum,
so as the array is sorted, to reduce the sum we need smaller number, so we reduce our right pointer by 1
​
And if the sum is smaller than the target, then we need to increment the left pointer by 1.
​
And at any point if the sum of elements at left and right pointer equals to the target we return the array containing the two indices,