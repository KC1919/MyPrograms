The intuition behind the Linear time approach i.e O(N) is that,
​
We firstly store the elements with their frequencies in a hashmap.
​
**Then we make an array of arraylist, which acts as a freq-bucket.
​
**That is it stores elements based on their frequencies in the corresponding frequency bucket.**
​
So the maximum size of the array is N+1. Because no element can have frequency greater than this.
​
**So at every index we have arraylist , as we need to store elements according to their frequencies, so there could be multiple elements with same frequency, so we take array of arraylist.**
​
*Now we have stored all the elements in the frequency bucket according to their respective frequencies.*
​
Now we ***iterate over the frequency bucket array from the end, so that we get the elements with highest frequency first***, and we keep collecting the elements till we collect K elements.
​
As soon as we collect K elements we return our ans.