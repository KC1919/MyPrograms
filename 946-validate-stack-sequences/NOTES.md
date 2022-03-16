We iterate over both pushed adn popped array.
​
So we check if the stack is not empty and the peek ele,ment is eqaul to the popped element
we pop the element from the stack and increment the popped index by 1.
​
If the the above condition is false, the we check if the current element being pushed is not equal to the current element in popped array, so we push the current element in the pushed array into the stack and increment the index by 1.
​
If the current element in the pushed array is equal to the current element in the popped array, we move index pointer in both the arrays.
​
when all the elements have been pushed.
​
We check till the stack is not empty, we check with the popped array elements, if all the stack element matches and gets popped out successfully, the the sequence was valid,
​
else if at any point the peek element do not match witht the current popped array element, we return false