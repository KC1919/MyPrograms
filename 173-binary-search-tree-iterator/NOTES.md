The intuition behind this approach is that , we have used
​
Iterative inorder traversal to save space for storing elements in inorder in an arraylist.
Then give our answer.
​
Instead we used **iterative inorder**, and used a stack which takes **max memory of O(H)**
and
​
When the next() function is called, **the value of the peek element of the stack is returned,
which makes it an O(1) operation. **
​
And *we update the stack which the next element of the inorder.*
​
And when the **hasNext() function is called** then *we check if the stack is empty or not.*
​
If the **stack is empty then false is** returned
else if the **stack is not empty then true is returned** meaning it has next elements of inorder present in it.