We calculate the mid.
We check which is the sorted part.
​
​
First we check for the left part to be sorted.
If the left part is sorted, we check if the possibility of the target to lie in the left half is not true.
​
We move the left pointer to mid+1; i.e we move to the right part
​
If the left part is not sorted, we go the right part.
Then we check for the possibility of the target to lie in the right part.
If its false, then we move our high to mid-1, i.e we move to the left part.
​