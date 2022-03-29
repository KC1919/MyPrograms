the main intuition behind this is that,
​
The numbers are in range from 1 to N, and the slots are N+1.
That means all the numbers have their slots.
​
And 0th index should be empty.
​
But as one element is duplicate, so 0th index should also be occupied.
​
So we start positioning number to their correct indices.
​
For eg. 1 will go to index 1, 2 will go to index 2.
​
So we check what element is present at index 0.
​
So we go to the index of the 0th element and swap the elements, to place the element to its correct index.
​
While doing so, if we find that the element we are trying to place at correct index is already present in its correct index.
​
That denotes the element is duplicate.
​
So we return it.