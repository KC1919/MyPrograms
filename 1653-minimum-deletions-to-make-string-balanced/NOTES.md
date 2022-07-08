till count of 'b' is 0, and 'a' are being encountered there is no problem, because no 'b' is among 'a'.
​
But if any 'b' comes and then 'a' occurrs, after b's, then there is a problem,
​
so we check if the count of 'b' is greater than 0 , while 'a' occurrs.
​
if the count is greater than 0 means there there are some b's before current 'a'.
​
So we increment the count of removals of 'a' and decrement the count of 'b' that have occurred before the current 'a'.
​
So in the end we return the total removals of 'a' that is our answer.
​
​