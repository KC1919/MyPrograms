**Using Sorting:**   Time: O(NlogN), Space: O(1)
Sort the array, then apply two-pointer approach
If the element at ith index and element at jth index sums to K, then increment the count by 1.
​
**Using HashMap:** Time: O(N) , Space: O(N)
​
First we map all the elements with their frequencies.
Then we iterate the array from the 1st element.
And we calculate the difference.
We look for the difference in the hashmap.
​
We check if the diff is equal to the element itself, then the frequency needs to be greater than 1, so as to make a pair.
​
If it is present we check if its frequency is greater than 0.
If yes then we increment the count of pair by 1 and reduce the frequency of the
ith element in the hashmap and also the diff element.
​
Finally when all the elements are traversed we have the total count of pairs and we return it.
​
​
​