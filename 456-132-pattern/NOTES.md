So, what we gonna do is, what if we handle these 2 things from our pattern i.e. 32 then getting 1 in front wll not be a big deal. So, for that what approach cames up in your mind is using stack, you'll gonna think it like a famous stack problem "Next Greater Element on Right" So, what we gonna care about is :-
​
Create a stack and initialize a variable thirdElement with Integer.MIN_VALUE.
​
We gonna start traversing from the end, means from right to left.
​
We gonna check if the current element is lesser then thirdElement. If it is, then it means our 132 pattern is satisfied as the stack is taking care of the 32 pattern and the current element satisfies remaining pattern. So return true.
​
If that's not the case, update the stack peek value. Keep popping from the stack until stack is empty OR the top value is > than the current value.
​
And, yes don't forgot to push the current element into the stack.
​
If pattern was not found in the array. So, return false.