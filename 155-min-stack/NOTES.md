we  maintain two stack.
​
One is the main stack in which all the elemnts are pushed.
The other one is  the min stack which contains all the minimum lements present in the main stack.
​
if the element comes we push it to the main stack.
​
And then we  check if the current element is smaller than thi peek of the min stack
if yes, then we push the current elemnt in the min stack.
​
because the peek of min stack always gives the minimum element present in the stack.
​
if the current element is not smaller than the peek lement of the min stack,
we do not push it into themin stack, and the peek element in the min stack remains the smallest element so far among all the elements present in the main stack.
​
now when we pop element from the stack, we check if the current element being popped from the main stack is equal to the element at the peek  of the min stack then we remove the element fromt he mins tack also.
​
Because that element will no longer be the minimum ele,ent because it is being removed from the main stack.
​
So the new peek element of the min stack will become the smallest element among all the elements of the meain stack.
​